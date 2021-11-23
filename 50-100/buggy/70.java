@javafx.fxml.FXML
private void onDragged(javafx.scene.input.MouseEvent e) {
    data.Point pos = transformCoordinate(e.getX(), e.getY());
    if (!(pos.equals(prevPos)))
        strategy.onDragged(pos);
    
    prevPos = pos;
}