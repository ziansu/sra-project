private static java.lang.String getString(java.lang.String query) {
    java.sql.ResultSet result;
    try (data.DatabaseConnection connection = new data.DatabaseConnection()) {
        result = connection.query(query);
        result.next();
        return result.getString(1);
    } catch (java.lang.Exception e) {
        return null;
    }
}