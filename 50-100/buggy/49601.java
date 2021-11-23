@java.lang.Override
protected java.util.List<com.nulldreams.media.model.Song> doInBackground(android.content.Context... params) {
    android.content.Context context = params[0];
    java.util.List<com.nulldreams.media.model.Song> songs = com.nulldreams.media.utils.MediaUtils.getAudioList(context);
    mTotalAlbumList = com.nulldreams.media.utils.MediaUtils.getAlbumList(context);
    for (com.nulldreams.media.model.Song song : songs) {
        song.setAlbumObj(getAlbum(song.getAlbumId()));
    }
    return songs;
}