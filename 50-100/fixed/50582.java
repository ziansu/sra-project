@java.lang.Override
public <C> C executeTransaction(java.util.concurrent.Callable<C> cCallable) {
    java.sql.Savepoint savepoint = null;
    C ret = null;
    try {
        savepoint = connection.setSavepoint();
        ret = cCallable.call();
        connection.releaseSavepoint(savepoint);
        connection.commit();
    } catch (java.lang.Exception e) {
        if (savepoint != null)
            try {
                connection.rollback(savepoint);
            } catch (java.sql.SQLException e1) {
                e1.printStackTrace();
            }
        
    }
    return ret;
}