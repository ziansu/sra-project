void drawNextShape(java.awt.Graphics g) {
    logic.ShapePrototypes nextShape = window.getGamePanel().getGame().getNextShape().getPrototype();
    for (logic.Vector2 pos : nextShape.getPositions()) {
        drawSinglePiece(g, pos.x, pos.y, nextShape.getColor());
    }
}