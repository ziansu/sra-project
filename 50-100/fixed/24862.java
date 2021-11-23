static void addTracks(java.util.ArrayList<com.awaker.data.TrackWrapper> tracks) {
    if (tracks.isEmpty())
        return ;
    
    java.sql.Statement statement;
    try {
        statement = com.awaker.data.DbManager.connection.createStatement();
        com.awaker.data.DbManager.connection.setAutoCommit(false);
        for (com.awaker.data.TrackWrapper track : tracks) {
            statement.executeUpdate(track.getInsertSQL());
        }
        com.awaker.data.DbManager.connection.commit();
        com.awaker.data.DbManager.connection.setAutoCommit(true);
        statement.close();
    } catch (java.sql.SQLException e) {
        com.awaker.util.Log.error(e);
    }
}