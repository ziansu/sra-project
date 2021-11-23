@javax.ws.rs.DELETE
@javax.ws.rs.Path(value = "{id}")
public javax.ws.rs.core.Response deleteAccount(@javax.ws.rs.PathParam(value = "id")
java.lang.String id) {
    javax.ws.rs.core.Response res;
    if ((edu.carleton.COMP4601.a1.Main.DatabaseManager.getInstance().removeDocument(java.lang.Integer.parseInt(id))) == null) {
        res = javax.ws.rs.core.Response.noContent().build();
    }else {
        res = javax.ws.rs.core.Response.ok().build();
    }
    return res;
}