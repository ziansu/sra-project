private boolean nodeExistInOSMDB(long osm_id) {
    try {
        pstmt_checkIfOSMIDExistInNode.setLong(1, osm_id);
        java.sql.ResultSet rs = pstmt_checkIfOSMIDExistInNode.executeQuery();
        if (!(rs.isBeforeFirst()))
            return true;
        
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return false;
}