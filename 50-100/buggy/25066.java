@java.lang.Override
public java.util.List<ers.Reim> getAllReims() {
    java.lang.String sql = "SELECT * FROM ERS_REIMBURSEMENT";
    java.util.List<ers.Reim> list = new java.util.ArrayList<ers.Reim>();
    try {
        java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
        java.sql.ResultSet rs = stmt.executeQuery();
        mapRows(rs, list);
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("SQLException at getAllReims");
        e.printStackTrace();
    }
    return null;
}