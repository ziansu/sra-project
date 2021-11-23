public java.lang.String getToken(org.wso2.carbon.identity.core.model.OpenIDRememberMeDO rememberMe) throws org.wso2.carbon.identity.provider.IdentityProviderException {
    org.wso2.carbon.identity.core.model.OpenIDRememberMeDO storedDo = null;
    if ((storedDo = org.wso2.carbon.identity.provider.openid.OpenIDRememberMeTokenManager.cache.getTokenData(rememberMe)) == null) {
        storedDo = dao.getTokenData(rememberMe);
        org.wso2.carbon.identity.provider.openid.OpenIDRememberMeTokenManager.cache.updateTokenData(rememberMe);
    }
    if (storedDo == null) {
        org.wso2.carbon.identity.provider.openid.OpenIDRememberMeTokenManager.log.debug(("No rememberMe token found for " + (rememberMe.getUserName())));
        return null;
    }
    if (!(isExpired(storedDo))) {
        return storedDo.getToken();
    }
    return null;
}