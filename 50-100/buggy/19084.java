public void updateArticle(org.mhi.persistence.Article article) {
    javax.persistence.EntityManager em = org.mhi.database.DBUtil.getEnitityManagerFactory().createEntityManager();
    try {
        em.getTransaction().begin();
        em.merge(article);
        em.refresh(article);
        em.flush();
    } catch (java.lang.Exception ex) {
        em.getTransaction().rollback();
        java.lang.System.out.println(("SQL-Exception: Transaction failed." + ex));
    } finally {
        em.close();
    }
}