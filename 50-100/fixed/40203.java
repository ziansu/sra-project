@com.flightstats.hub.channel.GET
@com.flightstats.hub.channel.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getChannelMetadata(@com.flightstats.hub.channel.PathParam(value = "channel")
java.lang.String channelName) {
    com.flightstats.hub.model.ChannelConfig config = channelService.getChannelConfig(channelName);
    if (config == null) {
        throw new com.flightstats.hub.channel.WebApplicationException(Response.Status.NOT_FOUND);
    }
    java.net.URI channelUri = com.flightstats.hub.channel.LinkBuilder.buildChannelUri(config, uriInfo);
    com.flightstats.hub.rest.Linked<com.flightstats.hub.model.ChannelConfig> linked = com.flightstats.hub.channel.LinkBuilder.buildChannelLinks(config, channelUri);
    return javax.ws.rs.core.Response.ok(channelUri).entity(linked).build();
}