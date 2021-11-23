public java.lang.String validate(final java.lang.String signature, final java.lang.String echostr, java.lang.String timestamp, final java.lang.String nonce) {
    return verify(signature, timestamp, nonce) ? echostr : "";
}