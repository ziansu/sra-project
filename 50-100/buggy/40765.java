private void showDemoPart(int index) {
    demoTextArea.getChildren().clear();
    demoTextArea.getChildren().add(new javafx.scene.text.Text(_demoText.get(index)));
    _mainController.getDisplayController().setSelectedTaskByCall(_demoSelectionIndexes.get(_demoIndex));
}