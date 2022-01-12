void moveOnGrid(int dx, int dy) {
    java.awt.Point destination = new java.awt.Point();
    destination.x = gridPosition.x;
    destination.y = gridPosition.y;
    destination.translate(dx, dy);
    if ((edu.virginia.engine.display.GridManager.getInstance().getSpriteAtGridPoint(destination)) == null) {
        edu.virginia.engine.display.GridManager.getInstance().moveSprite(gridPosition, destination);
    }
}