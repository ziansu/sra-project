@java.lang.Override
public com.twilio.demo.minotaur.core.command.Response action(final java.lang.String userId) {
    final java.net.URI uri = javax.ws.rs.core.UriBuilder.fromResource(com.twilio.demo.minotaur.resources.MediaResource.class).queryParam("From", userId).build();
    return new com.twilio.demo.minotaur.core.command.MultimediaResponse("Here is an image of the maze.", uri);
}