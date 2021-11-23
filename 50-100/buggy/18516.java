public void sendQuery(java.lang.String query) {
    java.lang.String sqlConName = guiController.getChosenDatabase();
    de.szut.brennecke.SQLiteBrowser.SQL.SQLConnection sqlCon = getSQLConnection(sqlConName);
    if (sqlCon != null) {
        java.sql.ResultSet rs = sqlCon.sendQuery(query);
        if (!(wrongQueryFlag)) {
            if (rs == null) {
                java.lang.System.out.println("last");
                rs = sqlCon.sendQuery(lastShowQuery);
            }else {
                lastShowQuery = query;
            }
            guiController.showQuery(rs);
        }
        wrongQueryFlag = false;
    }
}