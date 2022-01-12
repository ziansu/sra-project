@java.lang.Override
public com.epam.socode.domain.Profile addProfile(com.epam.socode.domain.Profile profile) {
    javax.persistence.EntityManager em = entityManagerFactory.createEntityManager();
    em.getTransaction().begin();
    em.persist(profile);
    em.getTransaction().commit();
    em.close();
    return profile;
}