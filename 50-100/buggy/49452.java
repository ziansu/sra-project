public boolean loginIsCreated(java.lang.String login) {
    com.zn0w.javacontent.db.DBConnector dbConnector = new com.zn0w.javacontent.db.DBConnector();
    try {
        java.sql.Statement statement = dbConnector.getConnection().createStatement();
        java.sql.ResultSet rs = statement.executeQuery("select * from users");
        while (rs.next()) {
            if (rs.getString(2).equals(login))
                return true;
            else
                return false;
            
        } 
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}