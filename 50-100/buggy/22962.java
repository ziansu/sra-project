public java.lang.String[] getColumnNames() {
    java.lang.String[] colNames = new java.lang.String[columns.length];
    int colIndex = 0;
    for (org.apache.spark.sql.api.java.StructField col : columns) {
        colNames[colIndex] = col.getName();
    }
    return colNames;
}