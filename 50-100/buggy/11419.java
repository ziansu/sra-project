@javafx.fxml.FXML
private void handleMouseHover(javafx.scene.input.MouseEvent event) {
    selector.setVisible(true);
    selector.setCenterX(event.getSceneX());
    selector.setCenterY(event.getSceneY());
    xInput.setText(java.lang.Double.toString(event.getSceneX()));
    yInput.setText(java.lang.Double.toString(event.getSceneY()));
    if (grid.getCurrPlayer().isDone())
        selector.setVisible(false);
    
}