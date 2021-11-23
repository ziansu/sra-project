@javafx.fxml.FXML
private void handleMouseHover(javafx.scene.input.MouseEvent event) {
    selector.setVisible(true);
    selector.setCenterX(event.getSceneX());
    selector.setCenterY(event.getSceneY());
    xInput.setText(java.lang.Integer.toString(((int) (event.getSceneX()))));
    yInput.setText(java.lang.Integer.toString(((int) (event.getSceneY()))));
    if (grid.getCurrPlayer().isDone())
        selector.setVisible(false);
    
}