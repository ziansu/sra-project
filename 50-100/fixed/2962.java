private void initialiseWindow() throws java.io.IOException {
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(getClass().getResource("LoginWindow.fxml"));
    javafx.scene.layout.AnchorPane pane = loader.load();
    ch.uzh.csg.p2p.controller.LoginWindowController loginWindowController = loader.getController();
    loginWindowController.setLoginWindow(this);
    javafx.scene.Scene scene = new javafx.scene.Scene(pane);
    scene.getStylesheets().add("basic.css");
    stage.setScene(scene);
    stage.setTitle(TITLE);
    stage.show();
}