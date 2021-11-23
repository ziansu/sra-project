public java.lang.String deletePlaylist(si.matjazcerkvenik.openmp3player.player.Playlist p) {
    si.matjazcerkvenik.openmp3player.backend.DAO.getInstance().removePlaylist(p);
    return "playlists";
}