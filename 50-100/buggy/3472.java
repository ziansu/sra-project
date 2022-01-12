public void buttonclick2() throws java.io.IOException {
    try {
        javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(getClass().getResource("/sample/Web.fxml"));
        javafx.scene.Parent root1 = ((javafx.scene.Parent) (fxmlLoader.load()));
        javafx.stage.Stage stage = new javafx.stage.Stage();
        stage.setScene(new javafx.scene.Scene(root1));
        stage.show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}