public boolean del(int reply_id) throws java.sql.SQLException {
    java.lang.String sbSQL = " delete from xps_problem_heel where id = ?; ";
    java.sql.Connection conn = dbquery.getConnection();
    java.sql.PreparedStatement ptmt = conn.prepareStatement(sbSQL);
    ptmt.setInt(1, reply_id);
    java.lang.System.out.println(sbSQL.toString());
    return (ptmt.executeUpdate()) > 0 ? true : false;
}