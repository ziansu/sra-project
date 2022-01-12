public void showStreamOverview() {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader(Main.class.getResource("fxml/streamOverview.fxml"));
        javafx.scene.layout.AnchorPane overviewPage = loader.load();
        SceneController controller = loader.getController();
        controller.setMain(this);
        rootLayout.setCenter(overviewPage);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}