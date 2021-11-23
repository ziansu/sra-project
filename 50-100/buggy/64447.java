private org.apache.spark.sql.catalyst.expressions.Row recordToRow(org.wso2.carbon.analytics.datasource.core.Record record) {
    if (record == null) {
        return null;
    }
    java.util.Map<java.lang.String, java.lang.Object> recordVals = record.getValues();
    java.util.List<java.lang.Object> rowVals = new java.util.ArrayList<java.lang.Object>(columns.size());
    for (java.lang.String column : columns) {
        rowVals.add(recordVals.get(column));
    }
    return org.apache.spark.sql.api.java.Row.create(rowVals).row();
}