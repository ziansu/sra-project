public static HbaseImporter.Table getTable(java.lang.String tN) {
    HbaseImporter.Connection connection = HbaseImporter.ImportThread.getConnection();
    org.apache.hadoop.hbase.TableName tableName = org.apache.hadoop.hbase.TableName.valueOf(tN);
    try {
        return connection.getTable(tableName);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return null;
}