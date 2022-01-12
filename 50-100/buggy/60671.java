@org.junit.Test
public void test10TermPeriod10() {
    util.finance.Money principal = new util.finance.Money(1000);
    double interest = 0.1;
    int term = 10;
    int period = 1;
    util.finance.Money expAmount = new util.finance.Money(104.64);
    util.finance.Money expPrincipalPaid = new util.finance.Money(103.78);
    util.finance.Money expInterestPaid = new util.finance.Money(0.86);
    util.finance.Money expEndingBalance = new util.finance.Money(0);
    logic.util.annuity.Payment p = calc.computePayment(principal, interest, term, period);
    doAsserts(p, expAmount, expPrincipalPaid, expInterestPaid, expEndingBalance);
}