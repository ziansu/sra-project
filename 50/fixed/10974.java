public void test() throws java.sql.SQLException {
    java.sql.PreparedStatement stmt = conn.prepareStatement("SELECT * FROM TEST");
    stmt.executeQuery();
}