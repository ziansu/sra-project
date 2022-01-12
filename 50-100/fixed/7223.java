public static java.util.Date getLatestDate(java.lang.Class articleClass) throws java.lang.NullPointerException {
    org.hibernate.Session session = com.cse10.database.HibernateUtil.getSessionFactory().openSession();
    java.sql.Date latestDate = ((java.sql.Date) (session.createCriteria(articleClass).setProjection(org.hibernate.criterion.Projections.max("createdDate")).uniqueResult()));
    session.close();
    return new java.util.Date(latestDate.getTime());
}