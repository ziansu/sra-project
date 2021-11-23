public java.util.List<dk.aau.sw802f15.tempoplayer.DataAccessLayer.Song> getSongsWithBPM(int BMP, int tresholdBMP) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(dk.aau.sw802f15.tempoplayer.DataAccessLayer.SongDatabase.TABLE_NAME, new java.lang.String[]{ "rowid" , "*" }, "bpm >= ? AND bpm <= ?", new java.lang.String[]{ java.lang.String.valueOf((BMP - tresholdBMP)) , java.lang.String.valueOf((BMP + tresholdBMP)) }, null, null, null, null);
    return constructSongListFromCursor(cursor, db);
}