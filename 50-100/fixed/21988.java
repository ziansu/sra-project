public boolean addCategoriesToProduct(int productID, java.util.List<java.lang.Integer> categories) {
    ua.sumdu.group73.model.OracleDataBase.log.info("Method addCategoriesToProduct starts.....");
    boolean result = false;
    if (categories.isEmpty())
        return true;
    
    initConnection();
    try (java.sql.PreparedStatement preparedStatement = conn.prepareStatement(ua.sumdu.group73.model.Queries.setCategoriesToProductQuery(productID, categories))) {
        preparedStatement.executeUpdate();
        result = true;
    } catch (java.sql.SQLException e) {
        ua.sumdu.group73.model.OracleDataBase.log.error("SQLException in addCategoriesToProduct()", e);
    } finally {
        closeConnection();
    }
    return result;
}