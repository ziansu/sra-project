@java.lang.Override
protected void fill(com.zhytnik.bank.domain.Credit c) {
    c.setAmount(amount);
    c.setValidFor(validFor);
    c.setMargin(margin);
    c.setFee(fee);
    c.setIsActive(isActive);
    c.setPenalty(penalty);
    c.setCreditCard(creditCard);
    c.setCurrency(currency);
    c.setClient(client);
}