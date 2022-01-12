public int execute(java.lang.String sql, java.lang.Object... params) {
    return jdbc.executeUpdate(sql, params);
}