public void makePayment(Loan loan) {
    if ((loan.getPrincipalBalance()) < (getPaymentAmount())) {
        this.totalAmountPaid += loan.getPrincipalBalance();
    }else {
        this.totalAmountPaid += getPaymentAmount();
    }
    loan.makePayment(getPaymentAmount());
}