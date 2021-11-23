@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "/dataset/{name}")
@java.lang.Override
public javax.ws.rs.core.Response removeDataset(@javax.ws.rs.PathParam(value = "name")
java.lang.String name) {
    try {
        api.removeDataset(name);
    } catch (java.io.IOException ex) {
        java.util.logging.Logger.getLogger(pt.ua.scaleus.service.query.RESTService.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    return javax.ws.rs.core.Response.status(200).build();
}