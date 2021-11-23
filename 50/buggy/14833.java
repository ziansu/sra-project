@javafx.fxml.FXML
public void close() {
    removeListeners();
    savePref();
    prefButton.getScene().getWindow().hide();
}