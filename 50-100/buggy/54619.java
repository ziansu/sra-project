public int getBingVotes(java.lang.String name) {
    int result = -1;
    try {
        java.lang.String query = ("select BING from User where NAME='" + name) + "'";
        java.sql.PreparedStatement pstmt = conn.prepareStatement(query);
        java.sql.ResultSet rs = pstmt.executeQuery();
        pstmt.close();
        if (rs.next()) {
            result = java.lang.Integer.parseInt(rs.getString("BING"));
        }
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return result;
}