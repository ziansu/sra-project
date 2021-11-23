@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/checkLogin")
@javax.ws.rs.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_JSON , javax.ws.rs.core.MediaType.TEXT_PLAIN })
public com.bk.khmt.restful.open311.Users checkLogin(@javax.ws.rs.QueryParam(value = "email")
java.lang.String email, @javax.ws.rs.QueryParam(value = "password")
java.lang.String password) {
    javax.persistence.Query query = em.createQuery("Select u FROM Users u WHERE u.userEmail = :email and u.passWord = :password");
    query.setParameter("email", email);
    query.setParameter("password", password);
    java.util.List<com.bk.khmt.restful.open311.Users> users = query.getResultList();
    if (!(users.isEmpty())) {
        java.lang.System.out.print(users.get(0).getUserEmail());
        return users.get(0);
    }else
        return null;
    
}