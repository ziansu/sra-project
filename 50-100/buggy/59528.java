private static java.lang.String normalizeDateCol(java.lang.Object colValue, java.lang.String originalColSpec) throws org.apache.hadoop.hive.ql.parse.SemanticException {
    java.sql.Date value;
    if (colValue instanceof org.apache.hadoop.hive.serde2.io.DateWritable) {
        value = ((org.apache.hadoop.hive.serde2.io.DateWritable) (colValue)).get();
    }else
        if (colValue instanceof java.sql.Date) {
            value = ((java.sql.Date) (colValue));
        }else {
            throw new org.apache.hadoop.hive.ql.parse.SemanticException(("Unexpected date type " + (colValue.getClass())));
        }
    
    return HiveMetaStore.PARTITION_DATE_FORMAT.get().format(value);
}