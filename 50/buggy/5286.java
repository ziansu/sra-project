public java.lang.String validate(final java.lang.String signature, final java.lang.String echostr, int timestamp, final java.lang.String nonce) {
    return verify(signature, timestamp, nonce) ? echostr : "";
}