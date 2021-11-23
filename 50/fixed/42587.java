@javafx.fxml.FXML
private void handleLoadStacked() {
    uiState.clearDetachedStages();
    uiState.getExpandedTitledPanes().clear();
    loadPreset("stackedLists.fxml");
}