@java.lang.Override
public void run() {
    ai151.grassi.controller.GameController.myGotchi.setGone(true);
    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Важная информация!");
    alert.setHeaderText(null);
    alert.setContentText("Ваш питомец ушёл от вас :с");
    java.util.Optional<javafx.scene.control.ButtonType> result = alert.showAndWait();
    if (result.isPresent()) {
        toMenu();
    }
}