public static java.lang.String getUserIdFromAccessToken(java.lang.String apiKey) {
    java.lang.String userId = null;
    java.lang.String decodedKey = new java.lang.String(org.apache.commons.codec.binary.Base64.decodeBase64(apiKey.getBytes(java.nio.charset.Charset.defaultCharset())), java.nio.charset.Charset.defaultCharset());
    java.lang.String[] tmpArr = decodedKey.split(":");
    if ((tmpArr.length) == 2) {
        userId = tmpArr[1];
    }
    return userId;
}