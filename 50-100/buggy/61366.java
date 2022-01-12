@java.lang.Override
public void executeTransaction(java.lang.Runnable runnable) {
    java.sql.Savepoint savepoint = null;
    try {
        savepoint = connection.setSavepoint();
        runnable.run();
        connection.commit();
        connection.releaseSavepoint(savepoint);
    } catch (java.lang.Exception e) {
        if (savepoint != null)
            try {
                connection.rollback(savepoint);
            } catch (java.sql.SQLException e1) {
                e1.printStackTrace();
            }
        
    }
}