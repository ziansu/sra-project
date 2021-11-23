@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(value = "SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE", justification = "We specifically want to allow the user to execute arbitrary SQL")
public int updateQuery(java.lang.String query) {
    int result = 0;
    try (java.sql.Connection conn = dataSource.getConnection();java.sql.Statement stmt = conn.createStatement()) {
        result = stmt.executeUpdate(query);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return result;
}