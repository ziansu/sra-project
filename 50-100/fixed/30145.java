private static void ensureCapacity() {
    synchronized(com.delta.core.util.JDBCUtil.connections) {
        for (int i = com.delta.core.util.JDBCUtil.minPoolSize; i < (com.delta.core.util.JDBCUtil.poolSize); i++) {
            try {
                com.delta.core.util.JDBCUtil.connections.add(java.sql.DriverManager.getConnection(com.delta.core.util.JDBCUtil.url, com.delta.core.util.JDBCUtil.properties));
            } catch (java.sql.SQLException e) {
                e.printStackTrace();
            }
        }
    }
    com.delta.core.util.JDBCUtil.println(((((("[REMIND]\t" + (new java.util.Date())) + "\t") + "Ensure Capacity to ") + (com.delta.core.util.JDBCUtil.poolSize)) + " now!"));
}