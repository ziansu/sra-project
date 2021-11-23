public synchronized java.sql.Connection getConnection() {
    int last_index = (pool.size()) - 1;
    if (last_index < 0)
        initPool();
    
    java.sql.Connection conn = pool.get(last_index);
    pool.remove(last_index);
    return conn;
}