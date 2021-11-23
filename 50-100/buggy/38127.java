public void executeQuery(java.lang.String query) {
    if (!(session.getTransaction().isActive()))
        session.beginTransaction();
    
    org.hibernate.query.Query q = session.createQuery(query);
    q.executeUpdate();
    transactionCommit();
    session.close();
    buildSession();
}