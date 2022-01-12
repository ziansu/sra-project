@java.lang.Override
public android.database.Cursor loadInBackground() {
    com.notime2wait.simpleplayer.PlaylistDbHelper dbHelper = com.notime2wait.simpleplayer.MainActivity.getMusicData().getPlaylistDbHelper();
    android.database.sqlite.SQLiteDatabase db = dbHelper.getReadableDatabase();
    if (com.notime2wait.simpleplayer.MainActivity.DEBUG)
        android.util.Log.e("SSSSSSSSS", ("" + (fragment.openedPlaylist())));
    
    android.database.Cursor cursor = ((fragment.openedPlaylist()) == null) ? dbHelper.getPlaylists(db) : dbHelper.getTracklist(db, fragment.openedPlaylist());
    return cursor;
}