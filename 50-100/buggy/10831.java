@controllers.Transactional
public static models.UserImpl fetchUser(java.lang.String username) {
    javax.persistence.EntityManager em = play.db.jpa.JPA.em();
    if ((em.find(models.UserImpl.class, username)) != null) {
        java.lang.System.out.println("ERROR NULL");
    }
    return em.find(models.UserImpl.class, username);
}