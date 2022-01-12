private loanDetails.Payment payment(double monthlyPayment, double additionalPrinciple, int payementNumber) {
    this.payment = monthlyPayment;
    double currentIntrest = (this.rate) * (this.adjustedPrinciple);
    double monthPrinc = (this.payment) - currentIntrest;
    this.adjustedPrinciple = (this.adjustedPrinciple) - monthPrinc;
    this.adjustedPrinciple = (this.adjustedPrinciple) - additionalPrinciple;
    return new loanDetails.Payment(payementNumber, this.adjustedPrinciple, additionalPrinciple, currentIntrest);
}