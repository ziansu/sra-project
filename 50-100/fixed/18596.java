@java.lang.Override
public void init() {
    this.originalConfig = this.getPluginJobConf();
    validateParameter();
    java.util.List<com.alibaba.datax.common.util.Configuration> columns = this.originalConfig.getListConfiguration(Key.COLUMN);
    for (com.alibaba.datax.common.util.Configuration c : columns) {
        java.lang.String cname = c.getString(Key.NAME);
        columnTypeMap.put(cname, c.getString(Key.TYPE));
    }
}