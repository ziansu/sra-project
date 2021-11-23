@java.lang.Override
public co.cask.cdap.metrics.process.MetricsConsumerMetaTable createConsumerMeta() {
    java.lang.String tableName = cConf.get(Constants.Metrics.KAFKA_META_TABLE);
    co.cask.cdap.data2.dataset2.lib.table.MetricsTable table = getOrCreateMetricsTable(tableName, DatasetProperties.EMPTY);
    return new co.cask.cdap.metrics.process.MetricsConsumerMetaTable(table);
}