@java.lang.Override
public java.lang.Void run() throws java.lang.Exception {
    org.apache.hadoop.hbase.client.Table table = connection.getTable(tableName);
    try {
        table.put(put);
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("Put failed with: " + ((e != null) && ((e.getMessage()) != null) ? e.getMessage().split("\n")[0] : e)));
    }
    return null;
}