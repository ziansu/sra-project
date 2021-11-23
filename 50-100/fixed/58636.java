public void charge(java.math.BigDecimal money) throws exceptions.LoanLimitException {
    java.math.BigDecimal difference = loan.subtract(balance);
    if ((money.compareTo(difference)) > 0)
        throw new exceptions.LoanLimitException((("Requested money exceeds available founds " + (difference.toString())) + (currency.getCurrencyCode())));
    
    balance = balance.add(money);
}