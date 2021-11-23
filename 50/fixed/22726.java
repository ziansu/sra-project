public void addVertex(int x, int y) {
    vertexPoints.add(new java.awt.Point(board.camera.getLocalX(x), board.camera.getLocalY(y)));
    updateSurfaceLines();
}