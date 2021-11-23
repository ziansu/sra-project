@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        playSong(songsTable.getSelectionModel().getSelectedItem());
        musicPlayer.playNewSong(songsTable.getSelectionModel().getSelectedItem(), musicPlayer.getLibrary().getTracksPointer(), musicPlayer.getLibrary().getTracksPointer().indexOf(songsTable.getSelectionModel().getSelectedItem()));
    }
}