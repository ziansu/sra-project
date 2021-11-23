@java.lang.Override
public java.util.Collection<com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse> execute(java.lang.String suppressId) throws com.magnet.mmx.server.plugin.mmxmgmt.MMXException {
    java.util.Collection<com.magnet.mmx.server.plugin.mmxmgmt.push.config.model.MMXPushSuppress> s = com.magnet.mmx.server.plugin.mmxmgmt.push.config.MMXPushConfigService.getInstance().getPushSuppressForAppAndUser(appId, null);
    return com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.convertResponse(s);
}