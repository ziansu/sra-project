@com.baremind.DELETE
@com.baremind.Path(value = "{id}")
public javax.ws.rs.core.Response deleteOption(@com.baremind.CookieParam(value = "sessionId")
java.lang.String sessionId, @com.baremind.PathParam(value = "id")
java.lang.Long id) {
    javax.ws.rs.core.Response result = javax.ws.rs.core.Response.status(401).build();
    if (com.baremind.utils.JPAEntry.isLogining(sessionId)) {
        result = javax.ws.rs.core.Response.status(404).build();
        long count = com.baremind.utils.JPAEntry.genericDelete(com.baremind.data.ProblemOption.class, "id", id);
        if (count > 0) {
            result = javax.ws.rs.core.Response.ok().build();
        }
    }
    return result;
}