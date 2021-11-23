public int executeUpdate(java.lang.String SQL, java.lang.Object... Args) {
    try {
        java.sql.PreparedStatement ps = _Connection.prepareStatement(SQL);
        for (int i = 1; i <= (Args.length); i++) {
            ps.setObject(i, Args[i]);
        }
        return ps.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return -1;
    }
}