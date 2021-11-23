@java.lang.Override
public void onPostTokenRenewal(org.wso2.carbon.identity.oauth2.dto.OAuth2AccessTokenReqDTO oAuth2AccessTokenReqDTO, org.wso2.carbon.identity.oauth2.dto.OAuth2AccessTokenRespDTO oAuth2AccessTokenRespDTO, org.wso2.carbon.identity.oauth2.token.OAuthTokenReqMessageContext oAuthTokenReqMessageContext, java.util.Map<java.lang.String, java.lang.Object> params) throws org.wso2.carbon.identity.oauth2.IdentityOAuth2Exception {
    for (org.wso2.carbon.identity.oauth.event.OAuthEventInterceptor interceptor : oAuthEventInterceptors) {
        if (interceptor.isEnabled()) {
            interceptor.onPreTokenRenewal(oAuth2AccessTokenReqDTO, oAuthTokenReqMessageContext, params);
        }
    }
}