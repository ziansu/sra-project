public boolean disconnect() {
    try {
        if ((conn) == null) {
            java.lang.System.out.println("INFO - Client is not connected to database");
            return true;
        }
        if (verbose)
            java.lang.System.out.println("INFO - Disconnecting from database");
        
        conn.close();
        if (verbose)
            java.lang.System.out.println("INFO - Disconnected from database");
        
        return true;
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println(("ERR - Exception: " + (ex.toString())));
        if (verbose)
            ex.printStackTrace();
        
        return false;
    }
}