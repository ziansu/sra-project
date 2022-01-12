@javafx.fxml.FXML
public void TakePhoto(javafx.event.ActionEvent event) throws java.io.IOException {
    javafx.stage.Stage stage = ((javafx.stage.Stage) (anchorPane.getScene().getWindow()));
    sl.StageLoad("/sopho/Ofeloumenoi/TakePhoto.fxml", stage, false, true);
}