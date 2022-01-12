private org.apache.spark.sql.catalyst.expressions.Row recordToRow(org.wso2.carbon.analytics.datasource.core.Record record) {
    if (record == null) {
        return null;
    }
    java.util.Map<java.lang.String, java.lang.Object> recordVals = record.getValues();
    java.lang.Object[] rowVals = new java.lang.Object[columns.size()];
    for (int i = 0; i < (columns.size()); i++) {
        rowVals[i] = recordVals.get(columns.get(i));
    }
    return org.apache.spark.sql.api.java.Row.create(rowVals).row();
}