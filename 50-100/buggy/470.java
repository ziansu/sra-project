public void removeSongFromAllPlaylists(BE.Music selectedSong) {
    for (BE.Playlist playlist : playlists) {
        for (BE.Music m : playlist.getMusiclist()) {
            if (m.getTitle().equals(selectedSong.getTitle())) {
                playlist.removeMusic(m);
                GUI.Model.PlaylistModel.instance.updatePlaylistView(playlist.getMusiclist());
            }
        }
    }
}