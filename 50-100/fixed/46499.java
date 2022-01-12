private static void printRow(org.apache.hadoop.hive.llap.Row row) {
    org.apache.hadoop.hive.llap.Schema schema = row.getSchema();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    int length = schema.getColumns().size();
    for (int idx = 0; idx < length; ++idx) {
        sb.append(row.getValue(idx));
        if (idx != (length - 1)) {
            sb.append(", ");
        }
    }
    java.lang.System.out.println(sb.toString());
}