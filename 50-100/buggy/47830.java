@java.lang.Override
public void createTable(org.apache.hadoop.hive.metastore.api.Table tbl) throws org.apache.hadoop.hive.metastore.api.InvalidObjectException, org.apache.hadoop.hive.metastore.api.MetaException {
    java.lang.String tbls = com.alibaba.fastjson.JSON.toJSONString(tbl);
    jedis.hset("table", ((("" + (tbl.getDbName())) + ".") + (tbl.getTableName())), tbls);
    org.apache.hadoop.hive.metastore.NewObjectStore.LOG.info((("-----tianlong-----create table " + (tbl.getTableName())) + " success!"));
}