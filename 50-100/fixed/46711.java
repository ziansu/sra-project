@java.lang.Override
public void save(T item) {
    org.hibernate.Transaction t = null;
    try {
        t = getSession().beginTransaction();
        getSession().save(item);
        t.commit();
    } catch (java.lang.RuntimeException e) {
        if (t != null) {
            t.rollback();
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        closeSession();
    }
}