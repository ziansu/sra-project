@javafx.fxml.FXML
private void handleMemory(javafx.event.ActionEvent event) {
    controllers.ConfigurationViewController.initializeListView(es.upv.inf.Product.Category.HDD_SSD);
    controllers.ConfigurationViewController.initializeListView(es.upv.inf.Product.Category.HDD);
}