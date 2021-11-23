public int executeUpdate(java.lang.String SQL, java.lang.Object... Args) {
    try {
        java.sql.PreparedStatement ps = _Connection.prepareStatement(SQL);
        for (int i = 0; i < (Args.length); i++) {
            ps.setObject((i + 1), Args[i]);
        }
        return ps.executeUpdate();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        return -1;
    }
}