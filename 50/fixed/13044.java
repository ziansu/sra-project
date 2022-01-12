public java.lang.String fetchAccessToken() throws com.paypal.base.rest.PayPalRESTException {
    if ((this.credential) != null) {
        return this.credential.getAccessToken();
    }
    return null;
}