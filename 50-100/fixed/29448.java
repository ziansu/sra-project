@org.junit.Test
public void testMinimumAmountPeriod1() {
    util.finance.Money principal = new util.finance.Money(0.01);
    double interest = 1;
    int term = 2;
    int period = 1;
    util.finance.Money expAmount = new util.finance.Money(0.01);
    util.finance.Money expPrincipalPaid = new util.finance.Money(0.0);
    util.finance.Money expInterestPaid = new util.finance.Money(0.0);
    util.finance.Money expEndingBalance = new util.finance.Money(0.01);
    logic.util.annuity.Payment p = calc.computePayment(principal, interest, term, period);
    doAsserts(p, expAmount, expPrincipalPaid, expInterestPaid, expEndingBalance);
}