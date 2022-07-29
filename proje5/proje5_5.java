package proje5;

import java.util.Scanner;

public class proje5_5 {

	 public static void main(String[] args) {
	     
		
		 double boy,kilo,indeks;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("lütfen boyunuzu giriniz:");
		 boy= input.nextDouble();
		 System.out.print("lütfen kilonuzu giriniz:");
		 kilo= input.nextDouble();
		 indeks= kilo/(boy*boy);
		 System.out.println("vücut kitle indeksiniz:" + indeks);
		 
		 } 
	 }

