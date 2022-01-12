public void Union(int i) throws java.sql.SQLException {
    java.sql.PreparedStatement stmt = conn.prepareStatement(UNION);
    PGStatement pgstmt = ((PGStatement) (stmt));
    pgstmt.setPrepareThreshold(0);
    stmt.setInt(1, i);
    stmt.setInt(2, i);
    java.sql.ResultSet r = stmt.executeQuery();
    java.lang.System.out.println(r.getString(1));
}