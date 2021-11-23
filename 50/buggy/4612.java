@java.lang.Override
public javax.persistence.TypedQuery<java.lang.Integer> createNamedQuery(java.lang.String string, java.lang.Class<java.lang.Integer> class1) {
    em = emFactory.createEntityManager();
    return em.createNamedQuery(string, class1);
}