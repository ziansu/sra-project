public static com.awaker.data.TrackWrapper getTrackWithoutColors() {
    try {
        java.sql.Statement statement = com.awaker.data.DbManager.connection.createStatement();
        java.sql.ResultSet resultSet = statement.executeQuery("SELECT id FROM music WHERE id NOT IN ( SELECT music_id FROM music_colors) LIMIT 1");
        if (resultSet.next()) {
            resultSet.close();
            return com.awaker.data.MediaManager.getTrack(resultSet.getInt("id"));
        }else {
            resultSet.close();
        }
    } catch (java.sql.SQLException e) {
        com.awaker.util.Log.error(e);
    }
    return null;
}