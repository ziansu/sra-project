@java.lang.Override
public javax.persistence.Query createNativeQuery(java.lang.String string) {
    em = emFactory.createEntityManager();
    return em.createNamedQuery(string);
}