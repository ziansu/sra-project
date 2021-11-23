public static java.sql.ResultSet getResult(java.lang.String qry) {
    de.lordvader.coinAPI.MySQL.connect();
    if (de.lordvader.coinAPI.MySQL.isConnected()) {
        try {
            java.sql.ResultSet resultSet = de.lordvader.coinAPI.MySQL.con.createStatement().executeQuery(qry);
            de.lordvader.coinAPI.MySQL.close();
            return resultSet;
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
    return null;
}