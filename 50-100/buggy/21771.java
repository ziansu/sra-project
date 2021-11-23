@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public javax.ws.rs.core.Response getView(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    com.courseExercise.carpooling.api.LoginToken token = new com.courseExercise.carpooling.api.LoginToken(request.getCookies());
    java.lang.String redirectUrl;
    if ((token != null) && ((token = authService.verifyAuthentication(token)) != null)) {
        redirectUrl = "/navigation";
    }else {
        redirectUrl = "/signin";
    }
    return javax.ws.rs.core.Response.temporaryRedirect(java.net.URI.create(redirectUrl)).build();
}