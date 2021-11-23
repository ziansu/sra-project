@javax.ws.rs.GET
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.TEXT_PLAIN })
public java.util.List<com.wlami.mibox.server.data.User> listUser() {
    javax.persistence.Query q = em.createQuery("SELECT u from User u");
    return q.getResultList();
}