public static int getDialogIDfromOneUserToAnother(java.lang.String fromWho, java.lang.String toWhom) {
    int result = 0;
    try (final java.sql.Connection connection = databaseTools.ConnectionPoolBasedApacheDBCP.getConnectionFromPool(DAO.DialoguesDAO.class.getSimpleName());final java.sql.Statement statement = connection.createStatement();final java.sql.ResultSet resultSet = statement.executeQuery(DAO.DialoguesDAO.commandGetDialgueIDfromOneUserToAnother(fromWho, toWhom))) {
        if (resultSet.next())
            result = resultSet.getInt(1);
        
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return result;
}