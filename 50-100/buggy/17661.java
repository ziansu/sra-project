public static java.lang.String[] extractCredentialsFromAuthzHeader(java.lang.String authorizationHeader) throws org.wso2.carbon.identity.oauth.common.exception.OAuthClientException {
    java.lang.String[] splitValues = authorizationHeader.trim().split(" ");
    if ((splitValues.length) == 2) {
        byte[] decodedBytes = org.apache.axiom.util.base64.Base64Utils.decode(splitValues[1].trim());
        if (decodedBytes != null) {
            java.lang.String userNamePassword = new java.lang.String(decodedBytes, org.apache.commons.io.Charsets.UTF_8);
            return userNamePassword.split(":");
        }
    }
    java.lang.String errMsg = "Error decoding authorization header. Space delimited \"<authMethod> <base64Hash>\" format violated.";
    throw new org.wso2.carbon.identity.oauth.common.exception.OAuthClientException(errMsg);
}