@javafx.fxml.FXML
private void switchToMenu(javafx.event.ActionEvent event) {
    try {
        pass2("customerMenu.fxml");
        javafx.scene.Parent home_page = javafx.fxml.FXMLLoader.load(getClass().getResource("customerMenu.fxml"));
        javafx.scene.Scene home_page_scene = new javafx.scene.Scene(home_page);
        javafx.stage.Stage app_stage = ((javafx.stage.Stage) (((javafx.scene.Node) (event.getSource())).getScene().getWindow()));
        app_stage.setScene(home_page_scene);
        app_stage.show();
    } catch (java.io.IOException e) {
    }
}