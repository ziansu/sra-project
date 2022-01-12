public void executeQuery(java.lang.String query) {
    buildSession();
    session.beginTransaction();
    org.hibernate.query.Query q = session.createQuery(query);
    q.executeUpdate();
    session.getTransaction().commit();
    session.close();
}