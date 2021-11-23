public static org.wso2.carbon.identity.oauth.dao.OAuthAppDO getAppInformationByClientId(java.lang.String clientId) throws org.wso2.carbon.identity.oauth.common.exception.InvalidOAuthClientException, org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception {
    org.wso2.carbon.identity.oauth.dao.OAuthAppDO oAuthAppDO = null;
    if (org.wso2.carbon.identity.oauth.config.OAuthServerConfiguration.getInstance().isCacheEnabled()) {
        oAuthAppDO = org.wso2.carbon.identity.oauth.cache.AppInfoCache.getInstance().getValueFromCache(clientId);
    }
    if (oAuthAppDO != null) {
        return oAuthAppDO;
    }else {
        oAuthAppDO = new org.wso2.carbon.identity.oauth.dao.OAuthAppDAO().getAppInformation(clientId);
        org.wso2.carbon.identity.oauth.cache.AppInfoCache.getInstance().addToCache(clientId, oAuthAppDO);
        return oAuthAppDO;
    }
}