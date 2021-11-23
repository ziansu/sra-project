private void addToBlacklist(java.lang.String url) {
    java.sql.PreparedStatement statement;
    try {
        java.net.URI uri = new java.net.URI(url);
        java.lang.String domain = uri.getHost();
        statement = com.database.Cleaner.db.connection.prepareStatement("INSERT INTO blacklist (url) VALUES (?), (?)");
        statement.setString(1, url);
        statement.setString(2, domain);
        statement.execute();
    } catch (java.net.URISyntaxException e) {
    } catch (java.sql.SQLException e) {
        java.lang.System.err.println("Failed to query database");
        e.printStackTrace();
    }
}