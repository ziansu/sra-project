@java.lang.Override
public void shutdown() {
    org.apache.hadoop.hive.metastore.NewObjectStore.LOG.info("-----tianlong-----shutdown");
    jedis.close();
}