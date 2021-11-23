@javafx.fxml.FXML
private void handleLoadStacked() {
    uiState.clearDetachedStages();
    uiState.getExpandedTitledPanes().clear();
    javafx.scene.Parent root = loadPreset("stackedLists.fxml");
}