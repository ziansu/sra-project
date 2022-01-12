@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        playSong(songsTable.getSelectionModel().getSelectedItem());
        musicPlayer.playNewSong(songsTable.getSelectionModel().getSelectedItem(), Playlist.SONGS_TABLE, musicPlayer.getLibrary().getTracksPointer().indexOf(songsTable.getSelectionModel().getSelectedItem()));
    }
}