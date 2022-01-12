@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public org.backmeup.model.BackMeUpUser findByName(java.lang.String username) {
    javax.persistence.Query q = em.createQuery("SELECT u FROM BackMeUpUser u WHERE username = :username");
    q.setParameter("username", username);
    java.util.List<org.backmeup.model.BackMeUpUser> users = q.getResultList();
    org.backmeup.model.BackMeUpUser u = (!(users.isEmpty())) ? users.get(0) : null;
    return u;
}