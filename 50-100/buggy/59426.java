@javax.ws.rs.Path(value = "watch/{random}")
@javax.ws.rs.GET
@javax.ws.rs.Produces(value = org.glassfish.jersey.media.sse.SseFeature.SERVER_SENT_EVENTS)
@java.lang.SuppressWarnings(value = { "ucd" , "resource" })
public static javax.ws.rs.core.Response watchLoginStatus(@javax.ws.rs.PathParam(value = "random")
java.lang.String random, @javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    org.glassfish.jersey.media.sse.EventOutput eventOutput = new org.glassfish.jersey.media.sse.EventOutput();
    java.util.Optional<nl.qiy.oic.op.domain.OAuthUser> loggedIn = nl.qiy.oic.op.service.OAuthUserService.getLoggedIn(request.getSession());
    if (loggedIn.isPresent()) {
        nl.qiy.oic.op.qiy.QiyAuthorizationFlow.notifyUserLoggedIn(random, loggedIn.get(), null);
    }else {
        nl.qiy.oic.op.qiy.QiyAuthorizationFlow.eventStreams.newEventOutput(random);
    }
    return javax.ws.rs.core.Response.ok().header(HttpHeaders.CONTENT_ENCODING, "identity").entity(eventOutput).build();
}