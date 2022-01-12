public static void checkPalindrome(java.util.Scanner scanner) {
    java.lang.System.out.println(("This program will ask you to enter a string, and then" + " it will tell you if that string is a palindrome or not."));
    java.lang.System.out.print("Please enter a string: ");
    scanner.nextLine();
    java.lang.String line = scanner.nextLine();
    java.lang.StringBuilder temp = new java.lang.StringBuilder(line);
    java.lang.String reversed = temp.reverse().toString();
    if (line.equals(reversed)) {
        java.lang.System.out.println("The entered string is a palindrome.");
    }else {
        java.lang.System.out.println("The entered string is not a palindrome.");
    }
}