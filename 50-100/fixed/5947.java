private void depositCash() {
    int account = selectAccount();
    if (account >= 0) {
        java.lang.System.out.println("Enter the amount that you would like to Deposit : ");
        double amount = 0;
        try {
            amount = java.lang.Double.parseDouble(keyboard.nextLine());
        } catch (java.lang.NumberFormatException e) {
            amount = 0;
        }
        atm.getPerson(account).getAccount().deposit(amount);
    }
}