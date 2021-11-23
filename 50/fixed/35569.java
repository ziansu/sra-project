public static synchronized com.andronovman.datasource.connection.Pool init() throws java.lang.Exception {
    if (com.andronovman.datasource.connection.Pool.instances.isEmpty()) {
        return null;
    }
    return com.andronovman.datasource.connection.Pool.instances.get(com.andronovman.datasource.connection.Pool.current);
}