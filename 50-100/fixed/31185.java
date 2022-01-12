public javafx.scene.layout.AnchorPane showByDay() throws java.io.IOException {
    by3Hours = false;
    java.lang.System.out.println(java.lang.Boolean.toString(by3Hours));
    javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
    loader.setLocation(MainApp.class.getResource("ByDay.fxml"));
    javafx.scene.layout.AnchorPane basicView = ((javafx.scene.layout.AnchorPane) (loader.load()));
    rootLayout.setCenter(basicView);
    ByDayController controller = ((ByDayController) (loader.getController()));
    controller.setMainApp(this);
    return basicView;
}