public void cleanup() {
    nc.removeInstance(gameID);
    if ((dd) != null)
        dd.cleanup();
    
    try {
        if ((dbConn) != null)
            dbConn.close();
        
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    dbConn = null;
}