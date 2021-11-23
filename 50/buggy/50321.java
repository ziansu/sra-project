public boolean isDeleted(org.apache.hadoop.hbase.Cell cell) {
    return (cell.getTimestamp()) < (familyDeleteTs);
}