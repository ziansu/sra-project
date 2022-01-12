public synchronized java.sql.Connection getConnection() {
    if ((pool.size()) <= 0) {
        initPool();
    }
    int last_index = (pool.size()) - 1;
    java.sql.Connection conn = pool.get(last_index);
    pool.remove(last_index);
    return conn;
}