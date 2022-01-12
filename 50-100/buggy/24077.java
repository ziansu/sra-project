public java.util.List getUserByProject(int projectId) {
    org.hibernate.Session session = HibernateSettings.HibernateUtil.getSessionFactory().openSession();
    org.hibernate.Transaction transaction;
    transaction = session.beginTransaction();
    org.hibernate.Query query = session.createQuery("select u.user from proman.Projectuser u where u.project.id=:projectId");
    query.setParameter("projectId", projectId);
    java.util.List<UserManagement.User> listt = query.list();
    transaction.commit();
    session.close();
    java.lang.System.out.println(("listt->" + listt));
    return listt;
}