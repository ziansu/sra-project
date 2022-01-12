@java.lang.Override
public void handle(javafx.scene.input.MouseEvent mouseEvent) {
    if (!(mouseEvent.isControlDown())) {
        if (!(selectedMDSPoints.containsKey(dataPoint.getExtraValue()))) {
            selectedMDSPoints.put(((int) (dataPoint.getExtraValue())), dataPoint);
            refresh(coordinates, filteredIndices, selectedCoordinates, selectedIndices, discardedCoordinates, discardedIndices);
            analysisController.refreshVisualizationsAfterGlobalSelection(selectedMDSPoints.keySet(), false);
        }
    }
}