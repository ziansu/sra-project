@java.lang.Override
public javax.ws.rs.core.Response clearEntries() {
    javax.ws.rs.core.Response response = null;
    try {
        java.util.ArrayList<java.lang.String> list = cacheService.listEntries();
        response = javax.ws.rs.core.Response.status(Response.Status.OK).entity(list).build();
    } catch (java.lang.Exception e) {
        com.ba.captwo.eda.demo.model.Error err = new java.lang.Error();
        err.setMessage(e.getMessage());
        response = javax.ws.rs.core.Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(err).build();
    }
    return response;
}