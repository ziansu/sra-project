public void playSelectedSong(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        startAlbum(metaDataTable.getSelectionModel().getSelectedIndex(), true);
    }
}