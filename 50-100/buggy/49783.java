@javax.ws.rs.POST
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON })
public javax.ws.rs.core.Response authenticate(final org.picketlink.credential.DefaultLoginCredentials credential) {
    final java.util.Optional<java.lang.String> token = authenticationService.validateChallenge(identity, credential);
    return token.isPresent() ? javax.ws.rs.core.Response.ok(javax.ws.rs.client.Entity.text(token)).build() : javax.ws.rs.core.Response.status(Status.FORBIDDEN).build();
}