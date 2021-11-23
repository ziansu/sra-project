@javafx.fxml.FXML
void dialogPreferences() throws java.io.IOException {
    javafx.stage.Stage dialogStage = new javafx.stage.Stage();
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("PiPreference.fxml"));
    loader.setController(new com.piscope.PiPreferenceController(""));
    javafx.scene.layout.BorderPane root = ((javafx.scene.layout.BorderPane) (loader.load()));
    com.piscope.PiPreferenceController controller = ((com.piscope.PiPreferenceController) (loader.getController()));
    javafx.scene.Scene scene = new javafx.scene.Scene(root);
    dialogStage.setScene(scene);
    dialogStage.showAndWait();
}