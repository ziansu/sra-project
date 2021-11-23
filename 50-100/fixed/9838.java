private static double getDouble(java.lang.String query) {
    java.sql.ResultSet result;
    try (data.DatabaseConnection connection = new data.DatabaseConnection()) {
        result = connection.query(query);
        result.next();
        return result.getDouble(1);
    } catch (java.lang.Exception e) {
        return -999999999;
    }
}