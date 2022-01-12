public static boolean isClosed() {
    if ((com.bigbass1997.overview.util.MySQLControl.connection) == null) {
        com.bigbass1997.overview.util.MySQLControl.isConnected = true;
        return true;
    }else
        try {
            if (com.bigbass1997.overview.util.MySQLControl.connection.isClosed()) {
                com.bigbass1997.overview.util.MySQLControl.isConnected = true;
                return true;
            }else {
                com.bigbass1997.overview.util.MySQLControl.isConnected = false;
                return false;
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            com.bigbass1997.overview.util.MySQLControl.isConnected = true;
            return true;
        }
    
}