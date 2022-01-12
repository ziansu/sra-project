private long dajBrojTipZahvata(org.hibernate.Session session) {
    java.lang.String hqlImaLi = "SELECT COUNT(*) FROM TipZahvata";
    org.hibernate.Query imaLi = session.createQuery(hqlImaLi);
    long broj = ((java.lang.Long) (imaLi.uniqueResult()));
    return broj;
}