private void startBeXLiteOTP(java.lang.String ticket) {
    com.mobile.bexlitepay.base.BEXStarter.get().requestOneTimePassword(this, ticket, this);
}