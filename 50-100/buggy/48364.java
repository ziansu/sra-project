public void execute(java.lang.String fileName) {
    java.lang.String sqlScript = readSqlScript(fileName);
    java.util.List<java.lang.String> statements = new java.util.ArrayList<>(java.util.Arrays.asList(sqlScript.split(";")));
    try (org.sql2o.Connection con = sql2o.beginTransaction()) {
        statements.forEach(( statement) -> {
            com.dovydasvenckus.todo.helper.db.SqlFileExecutor.logger.info(("Executing SQL command: " + statement));
            con.createQuery(statement).executeUpdate();
        });
    }
}