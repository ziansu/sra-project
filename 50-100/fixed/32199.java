private void handleColumns(javax.sql.DataSource ds, java.lang.String tableName, java.lang.String cols, java.util.Map<java.lang.String, java.lang.Integer> columnsType, java.util.List<java.lang.String> columns, java.util.List<java.lang.Integer> types) {
    org.apache.commons.lang3.tuple.Triple<java.util.List<java.lang.String>, java.util.List<java.lang.Integer>, java.util.Map<java.lang.String, java.lang.Integer>> result = meepo.dao.BasicDao.parserSchema(ds, tableName, cols);
    columns.addAll(result.getLeft());
    types.addAll(result.getMiddle());
    columnsType.putAll(result.getRight());
}