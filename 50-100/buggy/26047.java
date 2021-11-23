public java.sql.ResultSet GetShopsByCategory(java.lang.String shopCategory) throws java.sql.SQLException {
    ConnectToDB();
    stmt = conn.createStatement();
    java.lang.String sql = (((("select name, category, lng, lat, address, views " + ("from APP.SHOPS, APP.CATEGORIES" + " WHERE APP.CATEGORIES.CATEGORY='")) + shopCategory) + "'") + "and") + " APP.SHOPS.ID = APP.CATEGORIES.ID_IN_SHOPS";
    java.sql.ResultSet rs = stmt.executeQuery(sql);
    DisconnectFromDB();
    return rs;
}