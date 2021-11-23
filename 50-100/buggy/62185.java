@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("MainLayout.fxml"));
    bedsidemonitor.Main.ledTimer = new javafx.animation.Timeline(new javafx.animation.KeyFrame(javafx.util.Duration.millis(1000), ( ae) -> {
        bedsidemonitor.Main.led.toggle();
    }));
    bedsidemonitor.Main.ledTimer.setCycleCount(javafx.animation.Animation.INDEFINITE);
    bedsidemonitor.Main.ledTimer.play();
    java.lang.System.out.println("Reached Main");
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    stage.setScene(scene);
    stage.show();
}