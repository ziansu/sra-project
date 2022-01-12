public void startButtonListener() throws java.io.FileNotFoundException {
    songsInAlbum = metaDataTable.getItems();
    startAlbum(metaDataTable.getSelectionModel().getSelectedIndex(), true);
}