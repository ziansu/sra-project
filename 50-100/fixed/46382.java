@javafx.fxml.FXML
public void cancel(javafx.event.ActionEvent event) throws java.io.IOException {
    backend.GameEngine.getInstance().setSeason(backend.Season.load("save1.json"));
    season = backend.GameEngine.getInstance().getSeason();
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("/views/home.fxml"));
    javafx.stage.Stage stage = ((javafx.stage.Stage) (budget.getScene().getWindow()));
    stage.getScene().setRoot(root);
}