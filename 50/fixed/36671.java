@javafx.fxml.FXML
public void onSpanish(javafx.event.ActionEvent actionEvent) throws java.io.IOException {
    super.switchLanguage();
    switchScreen(MMGpane, "/Views/UserScreen.fxml");
    setSpanishText();
}