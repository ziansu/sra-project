@javafx.fxml.FXML
public void close() {
    savePref();
    prefButton.getScene().getWindow().hide();
}