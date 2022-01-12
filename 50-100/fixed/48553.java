public void submitButton_Clicked() {
    if ((selectionState) == 2) {
        controllers.MapController.getInstance().getCollectionOfNodes().resetForPathfinding();
        graph.createEdgeLines(mapController.requestPath());
    }
    selectionState = 0;
    java.lang.System.out.println("The user has clicked the submit Button");
}