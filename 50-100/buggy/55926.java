public void showBillboardOverview() {
    try {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(com.nexus.simplify.MainApp.class.getResource("UI/view/BillboardOverview.fxml"));
        javafx.scene.layout.AnchorPane billboardOverview = ((javafx.scene.layout.AnchorPane) (loader.load()));
        rootLayout.setCenter(billboardOverview);
        com.nexus.simplify.UI.view.BillboardOverviewController bbController = loader.getController();
        bbController.setMainApp(this);
        bbController.initBillboard(com.nexus.simplify.MainApp.database);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}