public static imf.network.Connection getConnection() {
    if (!(imf.network.ConnectionManager.connected))
        return null;
    
    return imf.network.ConnectionManager.conn;
}