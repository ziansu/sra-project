@javafx.fxml.FXML
public void onClickLogoutItem(javafx.event.ActionEvent actionEvent) {
    Main.db.destroy();
    try {
        Form.stage.setScene(new javafx.scene.Scene(javafx.fxml.FXMLLoader.load(getClass().getResource("../fxml/Login.fxml")), 500, 300));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}