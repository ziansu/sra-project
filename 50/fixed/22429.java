@javax.annotation.security.PermitAll
@javax.ws.rs.GET
@javax.ws.rs.Path(value = "ip")
@javax.ws.rs.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public com.sdm.core.util.GeoIPManager getIpResponse(@javax.ws.rs.core.Context
javax.servlet.http.HttpServletRequest request) throws java.lang.Exception {
    return new com.sdm.core.util.GeoIPManager(request.getRemoteAddr());
}