private void normalize() {
    name = ((name) == null) ? "" : name.trim();
    number = com.everypay.sdk.model.Card.normalizeNumber(number);
    expMonth = com.everypay.sdk.model.Card.normalizeNumber(expMonth);
    expYear = com.everypay.sdk.model.Card.normalizeNumber(expYear);
    cvc = com.everypay.sdk.model.Card.normalizeNumber(cvc);
}