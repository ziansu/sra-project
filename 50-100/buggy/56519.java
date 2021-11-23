public void submitButton_Clicked() {
    if ((selectionState) == 2) {
        if (mapController.areDifferentFloors()) {
            java.lang.System.out.println("Multi-floor pathfinding detected!");
            multiFloorPathfind();
        }else {
            pathFindingMenu.MapController.getInstance().getCollectionOfNodes().resetForPathfinding();
            java.util.ArrayList<pathFindingMenu.Edge> path = mapController.requestPath();
            graph.createEdgeLines(path);
            textDescription_TextFArea.setText(mapController.getTextDirections(path));
        }
    }
    selectionState = 0;
    java.lang.System.out.println("The user has clicked the submit Button");
}