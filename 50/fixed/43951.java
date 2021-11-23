@java.lang.Override
public void executeGeneratedRule(java.lang.String code) {
    try {
        java.sql.Statement stmt = connection.createStatement();
        stmt.execute(code);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}