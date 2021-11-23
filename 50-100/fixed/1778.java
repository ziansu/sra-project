public static java.sql.ResultSet queryTable(BeerDB.SQLGenerator obj) {
    java.lang.String queryStatement = obj.generateGetTableStatement();
    java.sql.ResultSet rs = null;
    if (queryStatement != null) {
        try {
            java.sql.Connection connection = BeerDB.DBConnector.getConnection();
            java.sql.Statement st = connection.createStatement();
            rs = st.executeQuery(queryStatement);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }else {
        java.lang.System.out.println("SQL Query Table statement is null");
    }
    return rs;
}