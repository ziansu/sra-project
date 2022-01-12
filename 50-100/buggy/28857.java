@java.lang.Override
public java.util.List<T> getAll() {
    org.hibernate.Session session = hospital.repositories.DbSessionFactory.get();
    try {
        session.beginTransaction();
        return session.createCriteria(type).list();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    } finally {
        session.close();
    }
    return new java.util.ArrayList<T>();
}