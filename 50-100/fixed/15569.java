public void lost() {
    new javafx.scene.media.MediaPlayer(new javafx.scene.media.Media(new java.io.File("sound/explosion.mp3").toURI().toString())).play();
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Train Simulator 2017");
    alert.setHeaderText(null);
    alert.setContentText("Sajnálom, vesztettél!");
    alert.showAndWait();
    mapManager.newMap(mapManager.getMap().getMapName());
    startGame();
}