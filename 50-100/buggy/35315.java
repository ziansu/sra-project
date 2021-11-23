private void setupScene(javafx.scene.layout.GridPane pane) {
    java.lang.String titleText;
    if ((comboBox.current_project) != null) {
        titleText = comboBox.current_project.name;
    }else {
        titleText = "Lemon Notes";
    }
    scene = new javafx.scene.Scene(pane, 600, 250);
    primaryStage.setTitle(titleText);
    primaryStage.setScene(scene);
    primaryStage.setResizable(true);
    primaryStage.show();
}