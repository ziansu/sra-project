public java.lang.String getNameCHByTranslateId(java.lang.String translateId) {
    java.lang.String sql = ("select NAMECH from DIM_TRANSLATE where TRANSLATEID='" + translateId) + "'";
    gov.gwssi.csc.scms.dao.EntityManager em = null;
    try {
        em = entityManagerFactory.createEntityManager();
        gov.gwssi.csc.scms.dao.Query query = em.createNativeQuery(sql);
        if ((query.getSingleResult()) != null) {
            return java.lang.String.valueOf(query.getSingleResult());
        }else {
            return "-";
        }
    } finally {
        if (em != null) {
            em.close();
        }
    }
}