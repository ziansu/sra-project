@md.utm.fi.datawarehause.GET
@md.utm.fi.datawarehause.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response convertFtoC() {
    try {
        return javax.ws.rs.core.Response.status(200).entity(userDAO.getFromDB("users")).build();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return javax.ws.rs.core.Response.status(404).build();
}