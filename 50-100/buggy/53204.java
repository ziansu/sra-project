@javafx.fxml.FXML
private void onPressed(javafx.scene.input.MouseEvent e) {
    data.Point pos = transformCoordinate(e.getX(), e.getY());
    data.PixelState startPosPixel = null;
    boolean clear = false;
    if ((e.getButton()) == (javafx.scene.input.MouseButton.SECONDARY))
        clear = true;
    else
        startPosPixel = pixelArray.getAt(pos.x, pos.y);
    
    strategy.onPressed(transformCoordinate(e.getX(), e.getY()), startPosPixel, clear);
}