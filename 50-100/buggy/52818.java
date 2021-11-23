@java.lang.Override
public int finduseridbydocid(int docid) {
    org.hibernate.Session session = sessionFactory.openSession().getSession();
    session.beginTransaction();
    org.hibernate.query.Query query = session.createSQLQuery("SELECT userid FROM documents WHERE docid =?");
    query.setParameter(0, docid);
    int userid = ((int) (query.list().get(0)));
    session.getTransaction().commit();
    session.close();
    java.lang.System.out.println(("The userid in the dao layer is " + userid));
    return userid;
}