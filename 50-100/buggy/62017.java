private static org.apache.hadoop.hive.common.ValidWriteIds extractWriteIds(java.util.Map<java.lang.String, org.apache.hadoop.hive.common.ValidWriteIds> writeIdMap, org.apache.hadoop.mapred.JobConf newjob, java.lang.String tableName) {
    if (org.apache.commons.lang.StringUtils.isBlank(tableName))
        return null;
    
    org.apache.hadoop.hive.common.ValidWriteIds writeIds = writeIdMap.get(tableName);
    if (writeIds == null) {
        writeIds = org.apache.hadoop.hive.common.ValidWriteIds.createFromConf(newjob, tableName);
        writeIdMap.put(tableName, (writeIds != null ? writeIds : org.apache.hadoop.hive.common.ValidWriteIds.NO_WRITE_IDS));
    }else
        if (writeIds == (org.apache.hadoop.hive.common.ValidWriteIds.NO_WRITE_IDS)) {
            writeIds = null;
        }
    
    return writeIds;
}