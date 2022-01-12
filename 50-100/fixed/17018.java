@java.lang.Override
public void LoadConfig(java.lang.String configStr) {
    if ((connection) != null) {
        return ;
    }
    try {
        com.gmt2001.datastore2.DataStore2.init("SqliteStore2", new java.lang.String[]{ configStr });
    } catch (java.lang.IllegalStateException | java.lang.ClassNotFoundException ex) {
        com.gmt2001.Console.err.printStackTrace(ex);
    }
    connection = com.gmt2001.datastore2.DataStore2.instance();
    transaction = connection.createTransaction();
    java.lang.Object[] o = com.gmt2001.datastore.SqliteStore.LoadConfigReal(configStr);
    use_indexes = ((boolean) (o[0]));
}