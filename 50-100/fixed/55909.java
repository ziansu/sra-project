@java.lang.Override
public java.util.List<ru.argos.springMVC.model.Taste> getAllLine() {
    java.util.List<ru.argos.springMVC.model.Taste> list;
    try {
        session = currentSession();
        final org.hibernate.Transaction transaction = session.beginTransaction();
        try {
            list = session.createQuery("from Taste ").list();
            transaction.commit();
        } catch (java.lang.Exception ex) {
            java.lang.System.out.println(("getAllLines" + (ex.toString())));
            transaction.rollback();
            throw ex;
        }
    } finally {
    }
    return list;
}