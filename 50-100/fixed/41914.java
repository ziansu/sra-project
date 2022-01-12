public com.ibm.prolaeoc.model.Badge searchForSerial(java.lang.String s) {
    s = s.toUpperCase();
    javax.persistence.EntityManager em = new com.ibm.prolaeoc.DAO.JPAUtil().getEntityManager();
    javax.persistence.TypedQuery<com.ibm.prolaeoc.model.Badge> query = em.createQuery("from Badge where uid=:puid and status=:pstatus", com.ibm.prolaeoc.model.Badge.class);
    query.setParameter("puid", s);
    query.setParameter("pstatus", "InReception");
    return query.getSingleResult();
}