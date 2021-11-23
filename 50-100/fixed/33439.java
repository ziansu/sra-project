public void insertAmount() {
    java.lang.System.out.print("How much money do you wish to insert on your WashCard? : ");
    java.lang.String amountInput = java.lang.System.console().readLine();
    double amountInputAsDouble = java.lang.Double.parseDouble(amountInput);
    amount = amountInputAsDouble;
    if (((amount) <= 1000.0) && ((amount) >= 200.0)) {
        balance = (balance) + (amount);
    }else {
        java.lang.System.out.println("You are only allowed to have a maximum of 1000kr and a minimum of 200kr on your WashCard.");
    }
}