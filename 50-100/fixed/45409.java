private void startGame() {
    if ((!(hasSameName)) && ((players.size()) > 1)) {
        javafx.scene.Scene scene = new javafx.scene.Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}