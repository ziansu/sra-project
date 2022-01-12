public void prepareSongQueue(java.util.ArrayList<java.lang.String> songPathList, int startIndex, boolean isResumed) {
    if (isResumed) {
        android.content.Intent i = new android.content.Intent("SONG_PREPARED");
        i.putExtra("INDEX", currentSongIndex);
        i.putExtra("PATH", (isShuffle ? shuffleQueue : songPathQueue).get(currentSongIndex));
        sendBroadcast(i);
    }else {
        songPathQueue = songPathList;
        currentSongIndex = startIndex;
        createShuffledPlaylist();
        prepareSong(currentSongIndex, songPathQueue);
    }
}