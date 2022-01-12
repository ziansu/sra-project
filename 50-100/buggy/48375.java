@javafx.fxml.FXML
private void onDragged(javafx.scene.input.MouseEvent e) {
    data.Point pos = transformCoordinate(e.getX(), e.getY());
    if (pos == null) {
        clearPreview();
        prevPos = data.Point.DUMMY_POINT;
    }else
        if (!(pos.equals(prevPos))) {
            clearPreview();
            strategy.onDragged(pos);
            prevPos = pos;
        }
    
}