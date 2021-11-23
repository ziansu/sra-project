private static boolean isPartitioned(org.apache.hadoop.hive.metastore.api.Table table) {
    return ((org.kitesdk.data.hcatalog.HiveUtils.getPartCols(table)) != null) && ((org.kitesdk.data.hcatalog.HiveUtils.getPartCols(table).size()) != 0);
}