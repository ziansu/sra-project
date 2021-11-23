@javafx.fxml.FXML
public void handleSignOut(javafx.event.ActionEvent event) throws java.io.IOException {
    UI.EditCourseController.course = null;
    UI.EditCourseController.course = null;
    javafx.scene.Parent home_parent = javafx.fxml.FXMLLoader.load(getClass().getResource("Login.fxml"));
    javafx.scene.Scene home_scene = new javafx.scene.Scene(home_parent);
    javafx.stage.Stage app_stage = ((javafx.stage.Stage) (((javafx.scene.Node) (event.getSource())).getScene().getWindow()));
    app_stage.setScene(home_scene);
    app_stage.show();
}