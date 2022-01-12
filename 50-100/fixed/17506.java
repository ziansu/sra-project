@java.lang.Override
public void start(javafx.stage.Stage stage) throws java.lang.Exception {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("excelParser.fxml"));
    loader.setController(new LabApplicationController());
    javafx.scene.Parent root = loader.load();
    stage.setTitle("Vey Lab");
    stage.setScene(new javafx.scene.Scene(root));
    stage.show();
}