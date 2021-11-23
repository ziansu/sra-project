public void setServer(net.md_5.bungee.api.connection.ProxiedPlayer p, java.lang.String server) {
    java.sql.PreparedStatement setServer = db.prepareStatement(this.getServer);
    try {
        setServer.setString(1, p.getUniqueId().toString());
        setServer.setString(2, server);
        setServer.setString(3, server);
        setServer.execute();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}