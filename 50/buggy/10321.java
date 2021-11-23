private void updateCanvasIF() {
    canvasIf = serialiseCanvas();
    canvasIf.repaint();
    canvasFrame.remove(0);
    canvasFrame.add(canvasIf);
}