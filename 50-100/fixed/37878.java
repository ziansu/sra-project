public void setRootNode(org.springframework.context.ApplicationContext springContext, javafx.scene.Parent rootNode) throws java.io.IOException {
    this.rootNode = ((javafx.scene.layout.VBox) (rootNode));
    this.springContext = springContext;
    javafx.fxml.FXMLLoader fxmlLoader = new javafx.fxml.FXMLLoader(getClass().getResource("/fxml/Range.fxml"));
    fxmlLoader.setControllerFactory(springContext::getBean);
    javafx.scene.Node rangeModule = fxmlLoader.load();
    javafx.collections.ObservableList<javafx.scene.Node> children = this.rootNode.getChildren();
    children.set(1, rangeModule);
    controller = fxmlLoader.getController();
}