@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public javax.ws.rs.core.Response services() {
    java.lang.String rendered = soyService.renderPlugin(pluginRegion, com.google.common.base.Optional.of(new com.jivesoftware.os.upena.deployable.region.ConfigPluginRegion.ConfigPluginRegionInput("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", false, true, false)));
    return javax.ws.rs.core.Response.ok(rendered).build();
}