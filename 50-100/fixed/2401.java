public static org.apache.http.client.methods.HttpRequestBase setAuthorizationHeader(info.wso2.scim2.compliance.protocol.ComplianceTestMetaDataHolder complianceTestMetaDataHolder, org.apache.http.client.methods.HttpRequestBase method) {
    java.lang.String auth = ((complianceTestMetaDataHolder.getUsername()) + ":") + (complianceTestMetaDataHolder.getPassword());
    if (!(auth.equals(":"))) {
        byte[] encodedAuth = org.apache.commons.codec.binary.Base64.encodeBase64(auth.getBytes(java.nio.charset.Charset.forName("US-ASCII")));
        java.lang.String authHeader = "Basic " + (new java.lang.String(encodedAuth));
        method.setHeader(HttpHeaders.AUTHORIZATION, authHeader);
    }
    return method;
}