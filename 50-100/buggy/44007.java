public void initialize() {
    setUserString(username_Label.getText());
    setModeChoices();
    setTitleChoices();
    currentFloor = 4;
    graph = new mapManagementFloorAndMode.MapOverlay(admin_FloorPane, ((controllers.mapScene) (this)));
    controllers.MapController.getInstance().requestMapCopy();
    graph.setMapAndNodes(controllers.MapController.getInstance().getCollectionOfNodes().getMap(currentFloor), true);
}