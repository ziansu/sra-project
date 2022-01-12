private static void insertItem(java.lang.String firstName, java.lang.String lastName, int idNum) {
    java.sql.Connection conn = edu.wright.cs.sp16.ceg3120.DerbyConn.establishConn();
    java.sql.PreparedStatement pstmt = null;
    try {
        pstmt = conn.prepareStatement("INSERT INTO Test values (?,?,?)");
        pstmt.setString(1, firstName);
        pstmt.setString(2, lastName);
        pstmt.setInt(3, idNum);
        pstmt.executeUpdate();
        pstmt.close();
    } catch (java.sql.SQLException sqlExcept) {
        sqlExcept.printStackTrace();
    }
}