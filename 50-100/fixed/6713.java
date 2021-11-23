public java.sql.ResultSet queryExecution(java.lang.String query) throws java.lang.Exception {
    java.sql.PreparedStatement preparedquery = db.prepareStatement((query + ";"));
    preparedquery.clearParameters();
    java.sql.ResultSet result = null;
    try {
        result = preparedquery.executeQuery();
    } catch (java.lang.Exception ex) {
    }
    return result;
}