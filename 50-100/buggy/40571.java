public javafx.scene.layout.AnchorPane showBy3Hours() throws java.io.IOException {
    by3Hours = true;
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
    loader.setLocation(MainApp.class.getResource("BasicFrame.fxml"));
    javafx.scene.layout.AnchorPane basicView = ((javafx.scene.layout.AnchorPane) (loader.load()));
    rootLayout.setCenter(basicView);
    By3HoursController controller = loader.getController();
    controller.setMainApp(this);
    return basicView;
}