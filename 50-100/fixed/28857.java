@java.lang.Override
public java.util.List<T> getAll() {
    try {
        session.beginTransaction();
        return session.createCriteria(type).list();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e);
    }
    return new java.util.ArrayList<T>();
}