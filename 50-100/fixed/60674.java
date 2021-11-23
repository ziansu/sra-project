public void printAvailableDeposits() {
    java.lang.System.out.println((("For " + (this.client)) + " available deposits:"));
    if (!(availableDeposits.isEmpty())) {
        for (com.gmail.mordress.lab1.deposits.models.Deposit iter : availableDeposits) {
            java.lang.System.out.println(iter);
        }
    }else {
        java.lang.System.out.println("Sorry, we have not available deposits for this client");
    }
}