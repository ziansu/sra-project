public java.util.List<com.ibm.prolaeoc.model.Badge> listReception(java.lang.String handbag) {
    javax.persistence.EntityManager em = new com.ibm.prolaeoc.DAO.JPAUtil().getEntityManager();
    javax.persistence.TypedQuery<com.ibm.prolaeoc.model.Badge> query = em.createQuery("from Badge where handbag=:phandbag and status=:pstatus ", com.ibm.prolaeoc.model.Badge.class);
    query.setParameter("phandbag", handbag);
    query.setParameter("pstatus", "SentToReception");
    return query.getResultList();
}