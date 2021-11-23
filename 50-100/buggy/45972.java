public void editPlaylist() {
    java.lang.System.out.println(((newname) + (selectedPlaylist)));
    if (((newname) != null) || (!(newname.equals("")))) {
        playlistdao.editPlaylist(selectedPlaylist, newname);
        this.playlistToShow = getPlaylist();
        this.newname = null;
    }
}