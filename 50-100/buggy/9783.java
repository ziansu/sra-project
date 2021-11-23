public cs446.mezzo.music.playlists.Playlist getPlaylist(java.lang.String playlistName) {
    if (mUserPlaylists.containsKey(playlistName)) {
        return mUserPlaylists.get(playlistName);
    }else
        if (playlistName.equals(cs446.mezzo.music.playlists.PlaylistManager.FAVOURITES)) {
            return mFavourites;
        }
    
    final cs446.mezzo.music.playlists.AutoPlaylist autoPlaylist = cs446.mezzo.music.playlists.AutoPlaylist.get(playlistName);
    if (autoPlaylist == null) {
        return null;
    }
    return autoPlaylist.getPlaylist(mLocalMusicFetcher, mStatCollector);
}