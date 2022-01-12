@java.lang.Override
protected void fill(com.zhytnik.bank.domain.Credit c) {
    c.setAmount(amount);
    c.setValidFor(validFor);
    c.setMargin(((margin) != null ? margin : 0));
    c.setFee(fee);
    c.setIsActive(isActive);
    c.setPenalty(((penalty) != null ? penalty : 0));
    c.setCreditCard(creditCard);
    c.setCurrency(currency);
    c.setClient(client);
}