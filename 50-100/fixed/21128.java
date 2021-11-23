private void updateTopArtists(org.tomahawk.libtomahawk.collection.Playlist playlist) {
    if ((playlist != null) && ((playlist.getEntries().size()) == 0)) {
        playlist = org.tomahawk.libtomahawk.database.DatabaseHelper.getInstance().getPlaylist(playlist.getId());
    }
    if ((playlist != null) && ((playlist.getEntries().size()) > 0)) {
        playlist.updateTopArtistNames();
        org.tomahawk.libtomahawk.database.DatabaseHelper.getInstance().updatePlaylist(playlist);
    }
}