private static java.lang.String hashString(java.lang.String input) throws java.io.UnsupportedEncodingException, java.security.InvalidKeyException, java.security.NoSuchAlgorithmException {
    com.github.draylundy.iec61850lti.oauth.OAuthAuthorization.logger.debug(("Payload : " + input));
    java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
    byte[] encrypted = digest.digest(input.getBytes(OAuthParameters.ENCODING));
    byte[] base64Text = org.apache.commons.codec.binary.Base64.encodeBase64(encrypted);
    return base64Text != null ? new java.lang.String(base64Text).trim().replace("+", " ") : "";
}