private void setupScene(javafx.scene.layout.GridPane pane) {
    java.lang.String titleText = "Lemon Notes";
    scene = new javafx.scene.Scene(pane, 600, 250);
    primaryStage.setTitle(titleText);
    primaryStage.setScene(scene);
    primaryStage.setResizable(true);
    primaryStage.show();
}