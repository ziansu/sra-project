public void deletePlaylist() {
    if (((lib.size()) > 0) && ((playlist) != null)) {
        java.lang.String name = playlist.getName();
        this.names.remove(name);
        this.lib.remove(playlist);
        contextproject.models.Playlist pl = new contextproject.models.Playlist();
        setAppLibrary(lib);
        this.update();
        playlistController.setPlaylist(pl);
    }
}