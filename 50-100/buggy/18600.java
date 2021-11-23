@java.lang.Override
public void refreshItems(java.sql.Connection c) throws java.sql.SQLException {
    fileIDs.clear();
    java.sql.PreparedStatement pStmt = c.prepareStatement("SELECT * FROM plsPlaylistTracks WHERE playlistId=? ORDER BY position ASC");
    pStmt.setInt(1, playlistId);
    java.sql.ResultSet rSet = pStmt.executeQuery();
    while (rSet.next()) {
        fileIDs.add(rSet.getInt("fileId"));
    } 
    rSet.close();
    pStmt.close();
}