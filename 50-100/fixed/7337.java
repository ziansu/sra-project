@javafx.fxml.FXML
public void save(javafx.event.ActionEvent event) throws java.io.IOException {
    season.save("save1.json");
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/views/home.fxml"));
    javafx.stage.Stage stage = ((javafx.stage.Stage) (budget.getScene().getWindow()));
    stage.getScene().setRoot(root);
}