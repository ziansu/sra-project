static int calcMax(java.lang.String tab, java.lang.String col) throws java.sql.SQLException {
    dbproject.DBproject.calc = (("SELECT MAX(" + col) + ") FROM ") + tab;
    dbproject.DBproject.calcMax = dbproject.DBproject.defaultConn.createStatement();
    java.sql.ResultSet result = dbproject.DBproject.calcMax.executeQuery(dbproject.DBproject.calc);
    int id = 0;
    while (result.next()) {
        id = result.getInt(1);
    } 
    java.lang.System.out.println(id);
    return id;
}