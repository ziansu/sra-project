@javax.ws.rs.GET
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.TEXT_HTML)
public javax.ws.rs.core.Response getView(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) {
    java.lang.String redirectUrl;
    if ((request.getCookies()) != null) {
        com.courseExercise.carpooling.api.LoginToken token = new com.courseExercise.carpooling.api.LoginToken(request.getCookies());
        if ((token != null) && ((token = authService.verifyAuthentication(token)) != null)) {
            redirectUrl = "/navigation";
        }else {
            redirectUrl = "/signin";
        }
    }else
        redirectUrl = "/signin";
    
    return javax.ws.rs.core.Response.temporaryRedirect(java.net.URI.create(redirectUrl)).build();
}