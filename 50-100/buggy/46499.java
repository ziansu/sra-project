private static void printRow(org.apache.hadoop.hive.llap.Row row) {
    org.apache.hadoop.hive.llap.Schema schema = row.getSchema();
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    for (int idx = 0; idx < (schema.getColumns().size()); ++idx) {
        if (idx > 0) {
            sb.append(", ");
            sb.append(row.getValue(idx));
        }
    }
    java.lang.System.out.println(sb.toString());
}