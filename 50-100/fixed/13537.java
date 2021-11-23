public int createTable(java.lang.String sql) {
    if ((connect()) != 0) {
        java.lang.System.err.println("Database is not connected!");
        return -1;
    }else {
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
            conn.commit();
            disconnect();
        } catch (java.lang.Exception e) {
            disconnect();
            return -1;
        }
    }
    return 0;
}