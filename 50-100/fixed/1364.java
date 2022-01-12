private void drawAnimatedTerrain(java.awt.Graphics g) {
    for (MapSquare animatedSquare : animatedSquares) {
        drawImageToGrid(level.map.animator.getCurrentPhaseTexture().textureFile, ((animatedSquare.col) * (SquintMainWindow.MAP_DIM)), ((animatedSquare.row) * (SquintMainWindow.MAP_DIM)), g, false, false);
    }
}