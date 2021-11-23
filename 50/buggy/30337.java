@javax.ws.rs.GET
@javax.ws.rs.Produces(value = "application/json")
public java.util.List<com.wlami.mibox.server.data.User> listUser() {
    java.lang.System.out.println(new java.io.File("test").getAbsolutePath());
    javax.persistence.Query q = em.createQuery("SELECT u from User u");
    return q.getResultList();
}