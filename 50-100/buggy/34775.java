public int getProductID(java.lang.String productname) {
    java.sql.PreparedStatement ps;
    java.sql.ResultSet rs;
    java.lang.String sQuery = "SELECT productID FROM products WHERE product_name = ?;";
    try {
        ps = con.getConnection().prepareStatement(sQuery);
        ps.setString(2, productname);
        rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt(1);
        }
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return 0;
}