@java.lang.Override
public java.util.List<java.lang.String> getAllDatabases() throws org.apache.hadoop.hive.metastore.api.MetaException {
    java.util.List<java.lang.String> dbs = new java.util.ArrayList<>();
    java.util.Map<java.lang.String, java.lang.String> maps = jedis.hgetAll("db");
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : maps.entrySet()) {
        dbs.add(entry.getKey());
    }
    return dbs;
}