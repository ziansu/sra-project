@java.lang.Override
public boolean isPaymentRequestAuthorized(org.bitcoinj.uri.BitcoinURI paymentRequest) {
    boolean result = showAuthViewAndGetResult(paymentRequest, true);
    if (!result) {
        this.onPaymentError("payment was not authorized!");
    }
    return result;
}