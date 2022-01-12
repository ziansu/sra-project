@javafx.fxml.FXML
public void handleViewPayload() throws java.io.IOException {
    javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource("PacketViewer.fxml"));
    javafx.stage.Stage payloadPopUp = new javafx.stage.Stage();
    payloadPopUp.setResizable(false);
    payloadPopUp.setTitle("Packet/Payload Information");
    javafx.scene.Scene nScene = new javafx.scene.Scene(root, 700, 500);
    nScene.getStylesheets().clear();
    nScene.getStylesheets().add("theme.css");
    payloadPopUp.setScene(nScene);
    payloadPopUp.show();
    java.lang.System.out.print("View Payload PopUp Launched\n");
}