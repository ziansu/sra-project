public java.util.LinkedList<net.classicgarage.truerandommusicplayer.model.SongItem> getFavoriteSongs() {
    if ((mFavSongs) == null) {
        mFavSongs = new java.util.LinkedList<net.classicgarage.truerandommusicplayer.model.SongItem>();
        for (net.classicgarage.truerandommusicplayer.model.SongItem song : getAllSongs()) {
            if (song.getFavorite())
                mFavSongs.add(song);
            
        }
    }
    return mFavSongs;
}