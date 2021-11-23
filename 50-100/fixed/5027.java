public java.lang.String genSql() throws java.io.IOException, java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
    init();
    excelConsumer.consume(path);
    java.util.List results = excelConsumer.parseToList(excelConsumer.getSheets().get(0));
    if ((enhance) != null) {
        results = ((java.util.List) (results.stream().map(enhance).collect(java.util.stream.Collectors.toList())));
    }
    java.lang.String sql = insertSQLGen.gen(results);
    return sql;
}