@java.lang.Override
public void process(java.lang.String json) {
    com.guhanjie.weixin.model.AccessToken at = com.alibaba.fastjson.JSONObject.parseObject(json, com.guhanjie.weixin.model.AccessToken.class);
    if (at != null) {
        com.guhanjie.weixin.token.AccessTokenKit.token = at.getAccess_token();
        com.guhanjie.weixin.token.AccessTokenKit.LOGGER.info("Success to refresh access token:[{}].", com.guhanjie.weixin.token.AccessTokenKit.token);
    }else {
        com.guhanjie.weixin.token.AccessTokenKit.LOGGER.error("Failed to refresh access token.");
    }
}