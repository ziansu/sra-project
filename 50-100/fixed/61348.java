@java.lang.Override
public org.apache.hadoop.hive.metastore.api.Table getTable(java.lang.String dbName, java.lang.String tableName) throws org.apache.hadoop.hive.metastore.api.MetaException {
    org.apache.hadoop.hive.metastore.api.Table table = null;
    java.lang.String tbls = jedis.hget("table", ((dbName + ".") + tableName));
    table = com.alibaba.fastjson.JSON.parseObject(tbls, org.apache.hadoop.hive.metastore.api.Table.class);
    org.apache.hadoop.hive.metastore.NewObjectStore.LOG.info((((("-----tianlong-----get table " + dbName) + ".") + tableName) + " success!"));
    return table;
}