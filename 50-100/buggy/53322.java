@java.lang.Override
public void createDatabase(org.apache.hadoop.hive.metastore.api.Database db) throws org.apache.hadoop.hive.metastore.api.InvalidObjectException, org.apache.hadoop.hive.metastore.api.MetaException {
    redis.clients.jedis.Jedis jedis = redisUtil.getJedis();
    java.lang.String dbs = com.alibaba.fastjson.JSON.toJSONString(db);
    jedis.hset("db", ("" + (db.getName())), dbs);
    org.apache.hadoop.hive.metastore.NewObjectStore.LOG.info((("-----tianlong-----create database " + (db.getName())) + " success!"));
    jedis.close();
}