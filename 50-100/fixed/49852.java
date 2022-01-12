static void makeWithdrawal() {
    java.util.Scanner input = new java.util.Scanner(java.lang.System.in);
    double amt;
    java.lang.System.out.println("\n");
    java.lang.System.out.println("Machine dispenses money in denomiations of $10, $20, or $100");
    java.lang.System.out.print("Please enter amount to withdraw:");
    amt = input.nextInt();
    amt = BlueBank.acct.withdraw(amt);
    if (amt == 0)
        java.lang.System.out.println("No money has been withdrawn.");
    
    java.lang.System.out.println();
    java.lang.System.out.println(("Your remaining balance: $" + (BlueBank.acct.getAccountBalance())));
}