@com.facebook.react.bridge.ReactMethod
public void getCardNonce(final java.lang.String cardNumber, final java.lang.String expirationMonth, final java.lang.String expirationYear, final java.lang.String cvv, final com.facebook.react.bridge.Callback successCallback, final com.facebook.react.bridge.Callback errorCallback) {
    this.successCallback = successCallback;
    this.errorCallback = errorCallback;
    com.braintreepayments.api.models.CardBuilder cardBuilder = new com.braintreepayments.api.models.CardBuilder().cardNumber(cardNumber).expirationMonth(expirationMonth).expirationYear(expirationYear).cvv(cvv).validate(true);
    com.braintreepayments.api.Card.tokenize(this.mBraintreeFragment, cardBuilder);
}