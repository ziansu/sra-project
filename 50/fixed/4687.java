@java.lang.Override
public boolean isMailUnique(java.lang.String mail) {
    javax.persistence.Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.mail = :mail", com.company.entity.User.class);
    query.setParameter("mail", mail);
    return (query.getResultList().size()) == 0;
}