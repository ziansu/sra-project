public int getNext() {
    java.lang.String SQL = "SELECT inflearn_JSPID FROM inflearn_JSP ORDER BY inflearn_JSPIDDESC";
    try {
        java.sql.PreparedStatement pstmt = conn.prepareStatement(SQL);
        rs = pstmt.executeQuery();
        if (rs.next()) {
            return (rs.getString(1)) + 1;
        }
        return 1;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return -1;
}