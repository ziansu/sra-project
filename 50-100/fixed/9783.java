public cs446.mezzo.music.playlists.Playlist getPlaylist(java.lang.String playlistName) {
    if (playlistName.equals(cs446.mezzo.music.playlists.PlaylistManager.FAVOURITES)) {
        return mFavourites;
    }else
        if (mUserPlaylists.containsKey(playlistName)) {
            return mUserPlaylists.get(playlistName);
        }
    
    final cs446.mezzo.music.playlists.AutoPlaylist autoPlaylist = cs446.mezzo.music.playlists.AutoPlaylist.get(playlistName);
    if (autoPlaylist == null) {
        return null;
    }
    return autoPlaylist.getPlaylist(mLocalMusicFetcher, mStatCollector);
}