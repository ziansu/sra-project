@java.lang.Override
public void save(travelexperts.Item product) {
    conn = travelexperts.TravelExpertsDB.GetConnection();
    try {
        java.lang.String query = "update products set ProdName = ? where ProductId = ?";
        java.sql.PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, product.getName());
        preparedStmt.setInt(2, product.getId());
        preparedStmt.executeUpdate();
        conn.close();
    } catch (java.lang.Exception e) {
        java.lang.System.err.println("Got an exception! ");
        java.lang.System.err.println(e.getMessage());
    }
}