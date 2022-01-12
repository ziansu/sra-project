public boolean existsRecordAtVersion(java.lang.String lectureId) {
    pstmt = null;
    java.lang.String sql = "select lectureId from version";
    try {
        pstmt = conn.prepareStatement(sql);
        java.sql.ResultSet result = pstmt.executeQuery(sql);
        while (result.next()) {
            java.lang.String LectureId = result.getString(1);
            if (LectureId.equals(lectureId))
                return true;
            
        } 
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(e.getMessage());
        e.printStackTrace();
    }
    return false;
}