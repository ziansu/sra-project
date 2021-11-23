@java.lang.Override
public void addAdmin(java.lang.String userName) {
    try {
        java.sql.Connection con = dataSource.getConnection();
        java.sql.PreparedStatement preparedStatement = con.prepareStatement(("INSERT INTO admins (user_id) " + ("VALUES((SELECT id FROM users WHERE username = ?))" + ";")));
        preparedStatement.setString(1, userName);
        java.lang.System.out.println(userName);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        con.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}