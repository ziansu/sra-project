public java.sql.ResultSet getUsers() {
    try {
        java.sql.PreparedStatement pstmt = con.prepareStatement("select * from employee");
        rs = pstmt.executeQuery();
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getStackTrace());
    } finally {
        try {
            if ((con) != null)
                con.close();
            
        } catch (java.lang.Exception e) {
        }
    }
    return rs;
}