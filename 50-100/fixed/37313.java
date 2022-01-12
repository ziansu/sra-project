public boolean add(com.kamontat.code.object.IDNumber number) {
    java.lang.String sql = "INSERT INTO DATA (id_num,create_at) ";
    sql += java.lang.String.format("VALUES ('%s', '%s');", number.getId(), number.getCreateAt_string());
    try {
        statement.execute(sql);
        done();
        return true;
    } catch (java.sql.SQLException e) {
        printSQLException(e);
        done();
        return false;
    }
}