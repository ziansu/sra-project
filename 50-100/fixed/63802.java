@org.junit.Test
public void testInsertSelectUser() throws java.sql.SQLException {
    java.sql.Connection conn = startConnection();
    com.company.Main.insertUser(conn, "Barry", "1234");
    java.util.ArrayList<com.company.User> userArray = com.company.Main.selectUser(conn);
    org.junit.Assert.assertTrue((userArray != null));
    java.util.ArrayList<com.company.User> userTest = com.company.Main.selectUser(conn);
    org.junit.Assert.assertTrue((!(userTest.isEmpty())));
    conn.close();
}