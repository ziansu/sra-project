@java.lang.Override
public T getById(int id) {
    try {
        session.beginTransaction();
        T entity = session.load(type, id);
        org.hibernate.Hibernate.initialize(entity);
        return entity;
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return null;
}