public java.util.ArrayList<tomerbu.edu.songdbhelper.models.Song> query() {
    java.util.ArrayList<tomerbu.edu.songdbhelper.models.Song> songs = new java.util.ArrayList<>();
    android.database.Cursor cursor = db.query(SongContract.Song.TABLE_NAME, null, null, null, null, null, null);
    if (cursor.moveToFirst()) {
        do {
            tomerbu.edu.songdbhelper.models.Song s = parseCursor(cursor);
            songs.add(s);
        } while (cursor.moveToNext() );
    }
    return songs;
}