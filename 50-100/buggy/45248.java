public static void remove(java.lang.String sharedConnectionName) {
    java.lang.ThreadLocal<java.sql.Connection> tl = de.cimt.talendcomp.connectionpool.ThreadLocalConnectionCache.connectionMap.get(sharedConnectionName);
    if (tl != null) {
        java.sql.Connection conn = tl.get();
        try {
            if ((conn != null) && ((conn.isClosed()) == false)) {
                conn.close();
            }
        } catch (java.sql.SQLException sqle) {
        }
    }
}