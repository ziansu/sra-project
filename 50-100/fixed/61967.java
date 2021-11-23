@javafx.fxml.FXML
protected void handleCompositionClick(javafx.scene.input.MouseEvent mouseEvent) {
    if (!(mouseEvent.isStillSincePress())) {
        return ;
    }
    this.handleStopMusic();
    if (!(mouseEvent.isControlDown())) {
        compositionPaneManager.handleClickAt(mouseEvent.getX(), mouseEvent.getY());
    }
}