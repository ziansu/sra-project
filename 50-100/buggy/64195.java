public boolean testBadQuery() {
    java.sql.PreparedStatement pss = null;
    java.sql.ResultSet rs = null;
    try {
        conn = getConnection();
        pss = conn.prepareStatement("terribly wrong query", java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE, java.sql.ResultSet.CONCUR_READ_ONLY);
        rs = pss.executeQuery();
        int countRows = pss.executeUpdate();
    } catch (java.sql.SQLException e) {
        exceptionHandler(e);
        return true;
    } finally {
        closeAll(conn, pss, rs);
    }
    return false;
}