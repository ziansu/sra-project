private void initializeTabs() {
    javafx.scene.control.Tab mainViewTab = new javafx.scene.control.Tab("Main View");
    javafx.scene.control.Tab wonderViewTab = new javafx.scene.control.Tab("Wonder View");
    mainViewTab.setDisable(true);
    mainViewTab.setContent(getMainView());
    wonderViewTab.setContent(getWonderView());
    getTabPane().getTabs().addAll(mainViewTab, wonderViewTab);
    getTabPane().setTabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy.UNAVAILABLE);
    this.getChildren().add(getTabPane());
}