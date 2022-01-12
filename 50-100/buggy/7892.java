public static java.lang.String decode(java.lang.String secret) {
    if (com.joenee.web.rest.ea.EaDecrypt.isDecrypt) {
        return secret;
    }
    if (org.apache.commons.lang.StringUtils.isEmpty(secret)) {
        return null;
    }
    java.lang.String source = null;
    try {
        source = new java.lang.String(org.springframework.util.Base64Utils.decode(com.joenee.web.rest.ea.EaDecrypt.hexStringToBytes(secret)), "gb2312");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return source;
}