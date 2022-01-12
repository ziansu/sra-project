private void drawAnimatedTerrain(java.awt.Graphics g) {
    for (MapSquare animatedSquare : animatedSquares) {
        drawImageToGrid(level.map.animator.getCurrentPhaseTexture().textureFile, ((animatedSquare.row) * (SquintMainWindow.MAP_DIM)), ((animatedSquare.col) * (SquintMainWindow.MAP_DIM)), g, false, false);
    }
}