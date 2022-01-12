public java.util.List<wairoadc.godiscover.model.Track> getAllTracks() {
    java.util.List<wairoadc.godiscover.model.Track> tracks = new java.util.ArrayList<wairoadc.godiscover.model.Track>();
    android.database.Cursor cursor = database.query(TrackTable.TRACK_TABLE, allColumns, null, null, null, null, null);
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        wairoadc.godiscover.model.Track track = cursorToTrack(cursor);
        tracks.add(track);
        cursor.moveToNext();
    } 
    cursor.close();
    return tracks;
}