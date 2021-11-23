public static java.sql.ResultSet getResult(java.lang.String qry) {
    if (de.lordvader.coinAPI.MySQL.isConnected()) {
        try {
            java.sql.ResultSet resultSet = de.lordvader.coinAPI.MySQL.con.createStatement().executeQuery(qry);
            return resultSet;
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}