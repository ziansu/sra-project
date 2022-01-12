@com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.GET
@com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.Path(value = "/all")
@com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
@com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response geAlltSuppress(@com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PathParam(value = "appId")
final java.lang.String appId) {
    com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.RestMethod<java.lang.String, java.util.Collection<com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse>> method = new com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.RestMethod<java.lang.String, java.util.Collection<com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse>>() {
        @java.lang.Override
        public java.util.Collection<com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.PushConfigSuppressResponse> execute(java.lang.String suppressId) throws com.magnet.mmx.server.plugin.mmxmgmt.MMXException {
            java.util.Collection<com.magnet.mmx.server.plugin.mmxmgmt.push.config.model.MMXPushSuppress> s = com.magnet.mmx.server.plugin.mmxmgmt.push.config.MMXPushConfigService.getInstance().getPushSuppressForAppAndUser(appId, null);
            return com.magnet.mmx.server.plugin.mmxmgmt.servlet.integration.PushConfigSuppressResource.convertResponse(s);
        }
    };
    return method.doMethod(appId);
}