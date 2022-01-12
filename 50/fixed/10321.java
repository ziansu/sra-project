private void updateCanvasIF() {
    canvasIf = serialiseCanvas();
    canvasIf.repaint();
    canvasFrame.remove(canvasIf);
    canvasFrame.add(canvasIf);
}