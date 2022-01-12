private int[] getDOBStageFour(java.sql.ResultSet rs) throws java.sql.SQLException {
    int[] iaDOB = new int[3];
    iaDOB[0] = rs.getInt("dayDOB");
    iaDOB[1] = rs.getInt("monthDOB");
    iaDOB[2] = rs.getInt("yearDOB");
    return iaDOB;
}