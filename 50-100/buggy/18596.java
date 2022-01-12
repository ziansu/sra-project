@java.lang.Override
public void init() {
    this.originalConfig = this.getPluginJobConf();
    validateParameter();
    java.util.List<com.alibaba.datax.common.util.Configuration> columns = this.originalConfig.getListConfiguration(Key.COLUMN);
    for (com.alibaba.datax.common.util.Configuration c : columns) {
        java.lang.String cname = c.get(Key.NAME, java.lang.String.class);
        columnTypeMap.put(cname, c.get(Key.TYPE, java.lang.String.class));
    }
}