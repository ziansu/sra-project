public boolean judgeUserExist(java.lang.String name) {
    java.lang.String sql = ("select * from User where NAME='" + name) + "'";
    boolean result = false;
    try {
        java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
        java.sql.ResultSet rs = pstmt.executeQuery();
        if (rs.next())
            result = true;
        
        pstmt.close();
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return result;
}