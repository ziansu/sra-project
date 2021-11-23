private void clearState() {
    startPoint = null;
    endPoint = null;
    multiLoc.clear();
    desNum = 0;
    startInfo.setText("Start Point: Not selected");
    endPointInfo.setText("End Point: Not selected");
    multipleDestination.removeAllItems();
    makeAStarRoute.setEnabled(false);
    emailButton.setEnabled(false);
    clearButton.setEnabled(false);
    gps.setText("");
    mapView.setGraph(graph);
    refreshMap(mapView);
}