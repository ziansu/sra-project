public static synchronized com.andronovman.datasource.connection.Pool init(java.lang.String id) throws java.lang.Exception {
    if (com.andronovman.datasource.connection.Pool.instances.isEmpty()) {
        return null;
    }
    com.andronovman.datasource.connection.Pool.current = id.toUpperCase();
    return com.andronovman.datasource.connection.Pool.init();
}