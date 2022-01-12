private org.wso2.carbon.apimgt.api.model.AccessTokenInfo getAccessTokenFromResponse(org.json.simple.JSONObject map) {
    org.wso2.carbon.apimgt.api.model.AccessTokenInfo tokenInfo = new org.wso2.carbon.apimgt.api.model.AccessTokenInfo();
    tokenInfo.setAccessToken(((java.lang.String) (map.get("access_token"))));
    tokenInfo.setValidityPeriod(java.lang.Long.valueOf(((java.lang.String) (map.get("expires_in")))));
    tokenInfo.setScope(new java.lang.String[]{ ((java.lang.String) (map.get("scope"))) });
    return tokenInfo;
}