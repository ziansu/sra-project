public java.sql.ResultSet getFromDataBase(java.lang.String query) {
    java.sql.Connection con = com.teamSuperior.core.connection.DBConnect.connect(com.teamSuperior.core.connection.DBConnect.url, com.teamSuperior.core.connection.DBConnect.username, com.teamSuperior.core.connection.DBConnect.password);
    java.sql.ResultSet rs = null;
    try {
        java.sql.Statement statement = con.createStatement();
        rs = statement.executeQuery(query);
        con.close();
    } catch (java.sql.SQLException ex) {
        java.lang.System.out.println(ex.getMessage());
        com.teamSuperior.guiApp.GUI.AlertBox.display("Connection Error", ex.getMessage());
    }
    return rs;
}