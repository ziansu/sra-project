public static com.j256.ormlite.support.ConnectionSource acquireConnection(java.lang.String uri, java.lang.String username, java.lang.String password) {
    if ((servers.SqlServerConnection.connection) == null) {
        try {
            servers.SqlServerConnection.connection = new com.j256.ormlite.jdbc.JdbcConnectionSource(uri);
            ((com.j256.ormlite.jdbc.JdbcConnectionSource) (servers.SqlServerConnection.connection)).setUsername(username);
            ((com.j256.ormlite.jdbc.JdbcConnectionSource) (servers.SqlServerConnection.connection)).setPassword(password);
            servers.SqlServerConnection.initDB(servers.SqlServerConnection.connection);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            servers.LocalServer.fatalError("a connection could not be made to the database");
        }
    }
    return servers.SqlServerConnection.connection;
}