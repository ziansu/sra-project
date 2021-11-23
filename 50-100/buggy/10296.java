public void updateFixedPrincipalAmount(final java.math.MathContext mc, final int periodNumber, final org.apache.fineract.organisation.monetary.domain.Money outstandingAmount) {
    final java.lang.Integer numberOfPrincipalPaymentPeriods = org.apache.fineract.portfolio.loanaccount.loanschedule.domain.LoanApplicationTerms.calculateNumberOfRemainingPrincipalPaymentPeriods(this.actualNumberOfRepayments, this.getRecurringMoratoriumOnPrincipalPeriods(), this.getPrincipalGrace(), periodNumber);
    org.apache.fineract.organisation.monetary.domain.Money principal = outstandingAmount.dividedBy(((numberOfPrincipalPaymentPeriods - periodNumber) + 1), mc.getRoundingMode());
    this.fixedPrincipalAmount = principal.getAmount();
}