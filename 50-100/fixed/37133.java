public static javafx.scene.Scene createMainScene() {
    javafx.scene.control.Button handy = new javafx.scene.control.Button("Handy");
    javafx.scene.control.Button test = new javafx.scene.control.Button("Test");
    javafx.scene.layout.GridPane root = root.sample.stages.MainScene.setLayout(handy, test);
    root.sample.stages.MainScene.setButtons(handy, test);
    root.setStyle("-fx-background-color: white");
    AppEntryPoint.stage.setTitle("Трочун Євгеній ІП-54");
    AppEntryPoint.wndNumber = 0;
    return new javafx.scene.Scene(root, 600, 400);
}