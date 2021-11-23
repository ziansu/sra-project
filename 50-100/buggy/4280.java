private void newPlaylistWizard() {
    javafx.scene.control.TextInputDialog dialog = new javafx.scene.control.TextInputDialog("New Playlist");
    dialog.setTitle("Playlist name request");
    dialog.setHeaderText("Please enter a name for your new playlist");
    java.util.Optional<java.lang.String> result = dialog.showAndWait();
    controller.makePlaylist(result.get());
    list.getItems().add(0, result);
    list.getSelectionModel().select(0);
}