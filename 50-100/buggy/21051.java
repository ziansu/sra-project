@com.baremind.DELETE
@com.baremind.Path(value = "{id}")
public javax.ws.rs.core.Response deleteOption(@com.baremind.CookieParam(value = "sessionId")
java.lang.String sessionId, @com.baremind.PathParam(value = "id")
java.lang.Long id) {
    javax.ws.rs.core.Response result = javax.ws.rs.core.Response.status(401).build();
    if (com.baremind.utils.JPAEntry.isLogining(sessionId)) {
        result = javax.ws.rs.core.Response.status(404).build();
        com.baremind.data.ProblemOption po = com.baremind.utils.JPAEntry.getObject(com.baremind.data.ProblemOption.class, "id", id);
        if (po != null) {
            com.baremind.utils.JPAEntry.genericDelete(po);
            result = javax.ws.rs.core.Response.ok(200).build();
        }
    }
    return result;
}