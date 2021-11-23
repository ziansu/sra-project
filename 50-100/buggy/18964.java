public static void set(java.lang.String sharedConnectionName, java.sql.Connection conn) {
    java.lang.ThreadLocal<java.sql.Connection> tl = de.cimt.talendcomp.connectionpool.ThreadLocalConnectionCache.connectionMap.get(sharedConnectionName);
    if (tl == null) {
        tl = new java.lang.ThreadLocal<java.sql.Connection>();
    }
    tl.set(conn);
}