private void ensureLoaded() {
    if ((mUserPlaylists) == null) {
        mUserPlaylists = loadUserPlaylists();
        mFavourites = loadPlaylist(cs446.mezzo.music.playlists.PlaylistManager.FAVOURITES);
    }
}