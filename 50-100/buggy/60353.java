@java.lang.Override
public T find(java.util.UUID id) {
    T entity = null;
    org.hibernate.Session session = at.fhv.itm14.fhvgis.persistence.utils.HibernateUtil.getSessionFactory().openSession();
    try {
        session.beginTransaction();
        entity = session.load(clazz, id);
        session.getTransaction().commit();
    } catch (org.hibernate.HibernateException e) {
        e.printStackTrace();
    } finally {
        session.close();
    }
    return entity;
}