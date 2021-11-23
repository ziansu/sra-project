public static java.lang.String computeSignature(java.util.Map<java.lang.String, java.lang.String> allParameters, java.lang.String secret, java.lang.String postUrl) throws java.io.UnsupportedEncodingException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException {
    java.util.Map<java.lang.String, java.lang.String> sortedMap = com.github.draylundy.iec61850lti.oauth.OAuthAuthorization.encodeKeysAndValues(allParameters);
    java.lang.String parameterString = com.github.draylundy.iec61850lti.oauth.OAuthAuthorization.createParameterString(sortedMap);
    java.lang.String baseString = com.github.draylundy.iec61850lti.oauth.OAuthAuthorization.createBaseString(parameterString, postUrl);
    java.lang.String computedSignature = com.github.draylundy.iec61850lti.oauth.OAuthAuthorization.encryptAndHash(baseString, secret);
    return computedSignature;
}