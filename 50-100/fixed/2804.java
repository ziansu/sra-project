@java.lang.Override
public void setConf(org.apache.hadoop.conf.Configuration conf) {
    org.apache.hadoop.hive.metastore.NewObjectStore.initialized = false;
    hiveConf = conf;
    java.util.Properties propsFromConf = org.apache.hadoop.hive.metastore.NewObjectStore.getDataSourceProps(conf);
    boolean propsChanged = !(propsFromConf.equals(org.apache.hadoop.hive.metastore.NewObjectStore.prop));
    if (propsChanged) {
        org.apache.hadoop.hive.metastore.NewObjectStore.prop = null;
    }
    (org.apache.hadoop.hive.metastore.NewObjectStore.count)++;
    initial(propsFromConf);
}