@java.lang.Override
public org.apache.hadoop.hive.metastore.api.Database getDatabase(java.lang.String name) throws org.apache.hadoop.hive.metastore.api.NoSuchObjectException {
    org.apache.hadoop.hive.metastore.api.Database db = null;
    java.lang.String dbs = jedis.hget("db", name);
    db = com.alibaba.fastjson.JSON.parseObject(dbs, org.apache.hadoop.hive.metastore.api.Database.class);
    org.apache.hadoop.hive.metastore.NewObjectStore.LOG.info((("-----tianlong-----get database " + name) + " success!"));
    return db;
}