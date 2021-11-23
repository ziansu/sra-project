@java.lang.Override
public void prepare() {
    java.util.List<com.alibaba.datax.common.util.Configuration> columns = writerSliceConfig.getListConfiguration(Key.COLUMN);
    int idx = 0;
    for (com.alibaba.datax.common.util.Configuration c : columns) {
        java.lang.String cname = c.getString(Key.NAME);
        columnIndexMap.put(cname, (idx++));
        ikang.datax.plugin.writer.titandbwriter.TitanDBWriter.logger.debug("columnIndexMap: {} => {}", cname, (idx - 1));
        columnTypeMap.put(cname, c.getString(Key.TYPE));
    }
}