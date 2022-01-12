public void withdrawal(double withdrawalAmount) {
    if (((this.balance) - withdrawalAmount) < 0) {
        java.lang.System.out.println((("Only " + (this.balance)) + " $ available. Withdrawal not processed"));
    }else {
        this.balance -= withdrawalAmount;
        java.lang.System.out.println((((("Withdrawal of " + withdrawalAmount) + " $ processed. Remaining balance = ") + (this.balance)) + " $."));
    }
}