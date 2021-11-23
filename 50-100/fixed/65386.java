@javafx.fxml.FXML
public void onClickLogoutItem(javafx.event.ActionEvent actionEvent) {
    try {
        Form.stage.setScene(new javafx.scene.Scene(javafx.fxml.FXMLLoader.load(getClass().getResource("../fxml/Login.fxml")), 500, 300));
        Main.db.destroy();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}