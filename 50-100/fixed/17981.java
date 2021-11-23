private java.lang.String decodeAuthorizationHeader(java.lang.String authorizationHeader) {
    if (authorizationHeader == null) {
        return null;
    }
    java.lang.String[] splitValues = authorizationHeader.trim().split(" ");
    byte[] decodedBytes = org.apache.axiom.util.base64.Base64Utils.decode(splitValues[1].trim());
    if (decodedBytes != null) {
        return new java.lang.String(decodedBytes);
    }else {
        if (org.wso2.carbon.webapp.authenticator.framework.authenticator.JWTAuthenticator.log.isDebugEnabled()) {
            org.wso2.carbon.webapp.authenticator.framework.authenticator.JWTAuthenticator.log.debug("Error decoding authorization header.");
        }
        return null;
    }
}