public static java.lang.String createURLSafeToken(java.lang.String seed) {
    try {
        byte[] b64 = org.apache.commons.codec.binary.Base64.encodeBase64(seed.getBytes());
        return new java.lang.String(b64);
    } catch (java.lang.Exception ex) {
        return "exception";
    }
}