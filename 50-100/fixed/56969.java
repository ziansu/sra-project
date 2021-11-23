public void actionPerformed(java.awt.event.ActionEvent e) {
    if (((playlistNameField.getText().trim()) != "") && (!(musicPlayer.playlistFolderNames.contains(playlistNameField.getText().trim())))) {
        createPlaylistFolder();
        updateMusicPlaylist();
        frame.dispose();
    }else
        if (musicPlayer.playlistFolderNames.contains(playlistNameField.getText().trim())) {
        }else {
        }
    
}