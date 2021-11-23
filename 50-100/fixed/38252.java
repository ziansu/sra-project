public void addUrl(java.lang.String url, java.lang.String category) throws java.io.IOException, java.sql.SQLException {
    logger.info(((("Adding url: " + url) + ", with category: ") + category));
    try (java.sql.Statement stmt = dbConnection.createStatement()) {
        stmt.executeUpdate(java.lang.String.format(("INSERT OR IGNORE INTO images(url, category) " + "values('%s', '%s'); "), url, category));
    }
}