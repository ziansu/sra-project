public static synchronized com.andronovman.datasource.connection.Pool init() throws java.lang.Exception {
    if (com.andronovman.datasource.connection.Pool.instances.isEmpty()) {
        throw new java.lang.Exception("First initialization connection pool must be done with parameters!");
    }
    return com.andronovman.datasource.connection.Pool.instances.get(com.andronovman.datasource.connection.Pool.current);
}