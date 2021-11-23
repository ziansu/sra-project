@javax.ws.rs.GET
@javax.ws.rs.Path(value = "/mail/{mail}")
public com.luckia.biller.core.model.User findByMail(@javax.ws.rs.PathParam(value = "mail")
java.lang.String mail) {
    javax.persistence.EntityManager entityManager = entityManagerProvider.get();
    java.util.List<com.luckia.biller.core.model.User> values = entityManager.createQuery("select u from User u where u.email = :mail", com.luckia.biller.core.model.User.class).setParameter("mail", mail).getResultList();
    return values.isEmpty() ? null : values.iterator().next();
}