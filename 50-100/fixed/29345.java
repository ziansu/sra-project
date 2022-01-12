private java.lang.String hmac(java.lang.String stringToSign) {
    java.lang.String signature = null;
    byte[] data;
    byte[] rawHmac;
    try {
        data = stringToSign.getBytes(utils.SignedRequestsHelper.UTF8_CHARSET);
        rawHmac = mac.doFinal(data);
        org.apache.commons.codec.binary.Base64 encoder = new org.apache.commons.codec.binary.Base64();
        signature = new java.lang.String(encoder.encode(rawHmac));
    } catch (java.io.UnsupportedEncodingException e) {
        throw new java.lang.RuntimeException(((utils.SignedRequestsHelper.UTF8_CHARSET) + " is unsupported!"), e);
    }
    return signature;
}