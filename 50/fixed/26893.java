@java.lang.Override
public com.lli.mp.wechatclient.model.AccessTokenResponseModel getAccessTokenByCode(java.lang.String code) {
    java.lang.String wechatAccessTokenUri = java.lang.String.format(wechatAccessTokenUriTemplate, appId, appsecret, code);
    return restTemplate.getForObject(wechatAccessTokenUri, com.lli.mp.wechatclient.model.AccessTokenResponseModel.class);
}