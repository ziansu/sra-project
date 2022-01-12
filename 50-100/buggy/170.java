private org.joda.money.Money parseMoney(de.oette.swiftparser.SwiftMt940Parser.MoneyContext moneyContext) {
    org.joda.money.CurrencyUnit currencyUnit = null;
    if ((swiftMt4TransactionCollection.getCurrency()) != null) {
        currencyUnit = org.joda.money.CurrencyUnit.of(swiftMt4TransactionCollection.getCurrency());
    }
    java.math.BigDecimal amount = moneyMajorToBigDecimal(moneyContext.moneyMajor()).add(moneyMinorToBigDecimal(moneyContext.moneyMinor()));
    return org.joda.money.Money.of(currencyUnit, amount);
}