public static com.birdle.pranay.birdle.Song[] list() {
    android.database.Cursor songsCursor = com.birdle.pranay.birdle.Song.getListOfItems();
    com.birdle.pranay.birdle.Song[] songList = new com.birdle.pranay.birdle.Song[]{  };
    songsCursor.moveToFirst();
    for (int i = 0; i < (songsCursor.getCount()); i++) {
        songList[i] = new com.birdle.pranay.birdle.Song(com.birdle.pranay.birdle.Song.mContext, songsCursor.getLong(songsCursor.getColumnIndexOrThrow(SongContract.SongSchema._ID)));
        songsCursor.moveToNext();
    }
    return songList;
}