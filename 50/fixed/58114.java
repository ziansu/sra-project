@javafx.fxml.FXML
protected void cancelHandler(javafx.event.ActionEvent event) throws java.lang.Exception {
    ((javafx.scene.Node) (event.getSource())).getScene().getWindow().hide();
}