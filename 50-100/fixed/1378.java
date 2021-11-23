public double makePayment(Loan loan) {
    if ((loan.getPrincipalBalance()) < (getPaymentAmount())) {
        this.totalAmountPaid += loan.getPrincipalBalance();
        loan.makePayment(getPaymentAmount());
        return loan.getPrincipalBalance();
    }else {
        this.totalAmountPaid += getPaymentAmount();
        loan.makePayment(getPaymentAmount());
        return 0.0;
    }
}