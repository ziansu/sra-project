public trackModel.TrackBlock getSection(java.lang.String line, int block) throws java.sql.SQLException {
    trackModel.TrackBlock tempBlock = new trackModel.TrackBlock();
    java.sql.Statement stmt = conn.createStatement();
    java.sql.ResultSet rs = stmt.executeQuery(((("SELECT * FROM TTEDB.RailLines where line = '" + line) + "' and BlockNumber = ") + block));
    tempBlock = populateTrackBlock(rs);
    stmt.close();
    conn.close();
    return tempBlock;
}