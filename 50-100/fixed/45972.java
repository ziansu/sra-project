public void editPlaylist() {
    if (((newname) != null) || (!(newname.equals("")))) {
        playlistdao.editPlaylist(selectedPlaylist, newname);
        this.playlistToShow = getPlaylist();
        this.newname = null;
    }
}