@javafx.fxml.FXML
void backMain(javafx.event.ActionEvent event) throws java.lang.Exception {
    stage = ((javafx.stage.Stage) (((javafx.scene.control.Button) (event.getSource())).getScene().getWindow()));
    root = javafx.fxml.FXMLLoader.load(getClass().getResource("/view/mainView.fxml"));
    scene = new javafx.scene.Scene(root);
    stage.setScene(scene);
}