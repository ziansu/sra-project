public void begin(contextproject.controllers.PlaylistController playlistcontroller, javafx.scene.Scene scene) {
    this.playlistController = playlistcontroller;
    playlist = lib.get(0);
    tableView.setOnMousePressed(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(javafx.scene.input.MouseEvent event) {
            if (event.isPrimaryButtonDown()) {
                java.lang.String name = tableView.getSelectionModel().getSelectedItem().getName();
                playlist = getPlaylist(name);
                playlistController.setPlaylist(playlist);
            }
        }
    });
}