@javafx.fxml.FXML
protected void handleCompositionClick(javafx.scene.input.MouseEvent mouseEvent) {
    if (!(mouseEvent.isStillSincePress())) {
        return ;
    }
    this.handleStopMusic();
    if (mouseEvent.isControlDown()) {
        compositionPaneManager.handleControlClickAt(mouseEvent.getX(), mouseEvent.getY());
    }else {
        compositionPaneManager.handleClickAt(mouseEvent.getX(), mouseEvent.getY());
    }
}