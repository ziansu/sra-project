private static com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse convertResponse(com.magnet.mmx.server.plugin.mmxmgmt.push.config.model.MMXPushSuppress s) {
    com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse response = new com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse();
    response.setSuppressId(s.getSuppressId());
    response.setAppId(s.getAppId());
    response.setUserId(s.getUserId());
    response.setChannelName(s.getChannelName());
    return response;
}