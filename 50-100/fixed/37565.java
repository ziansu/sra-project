public void readFiles() {
    br.ufrn.imd.dao.MusicDAO musicDAO = new br.ufrn.imd.dao.MusicDAO();
    musicDAO.setMusics(this.readMusicsFile());
    br.ufrn.imd.dao.UserDAO userDAO = new br.ufrn.imd.dao.UserDAO();
    userDAO.setUsers(this.readUsersFile());
    br.ufrn.imd.dao.PlaylistDAO playlistDAO = new br.ufrn.imd.dao.PlaylistDAO();
    playlistDAO.setPlaylists(this.readPlaylistsFile());
}