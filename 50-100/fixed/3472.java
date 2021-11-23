public void buttonclick2() throws java.io.IOException {
    try {
        javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(getClass().getResource("/sample/Web.fxml"));
        javafx.stage.Stage stage = new javafx.stage.Stage();
        stage.setScene(new javafx.scene.Scene(fxmlLoader.load()));
        stage.show();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}