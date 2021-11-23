public java.util.ArrayList<java.lang.Integer> getRemainingIDs(java.lang.String tableName, java.lang.String whereClause) throws java.sql.SQLException {
    context.healthinformatics.Database.Db data = context.healthinformatics.Database.SingletonDb.getDb();
    java.sql.ResultSet rs = data.execQuery(tableName, whereClause);
    java.util.ArrayList<java.lang.Integer> intArr = new java.util.ArrayList<java.lang.Integer>();
    while (rs.next()) {
        intArr.add(rs.getInt("statid"));
    } 
    rs.close();
    return intArr;
}