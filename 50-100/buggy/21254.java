@javafx.fxml.FXML
private void NextPage(javafx.event.ActionEvent ev) throws java.io.IOException {
    javafx.stage.Stage stage = new javafx.stage.Stage();
    javafx.scene.Parent root2 = javafx.fxml.FXMLLoader.load(getClass().getResource("SignUp.fxml"));
    java.lang.System.out.println("made it here");
    javafx.scene.Scene scenes = new javafx.scene.Scene(root2);
    stage.setScene(scenes);
    stage.show();
}