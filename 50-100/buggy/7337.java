@javafx.fxml.FXML
public void save(javafx.event.ActionEvent event) throws java.io.IOException {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/views/home.fxml"));
    javafx.stage.Stage stage = ((javafx.stage.Stage) (budget.getScene().getWindow()));
    season.save("save1.json");
    stage.getScene().setRoot(root);
}