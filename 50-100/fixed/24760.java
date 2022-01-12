public static void transferScore(java.lang.String sessionVar) {
    java.lang.String account;
    boolean success = true;
    int amount;
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.System.out.println("Please Enter the name of the account that you want to transfer the coins to. ");
    account = scanner.nextLine();
    java.lang.System.out.println("Please enter in the amount of coins you wish to transfer.");
    amount = scanner.nextInt();
    if (success) {
        java.lang.System.out.println(((("You have transfered " + amount) + " to ") + account));
    }else {
        java.lang.System.out.println("Your attempted transfer has failed. Please try again.");
    }
}