@java.lang.Override
protected boolean cacheAuthenticator(java.lang.String authenticator) {
    java.lang.String query = "INSERT INTO authenticators (authenticator) VALUES (?)";
    try {
        java.sql.PreparedStatement stmt = com.spinalcraft.manager.server.Database.getInstance().prepareStatement(query);
        stmt.setString(1, authenticator);
        return stmt.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return false;
    }
}