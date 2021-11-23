public com.thrashplay.jounce.entity.GameObject createTopWall() {
    com.thrashplay.luna.api.geom.Rectangle gameBounds = jounce.getGameBoardDimensions();
    com.thrashplay.jounce.entity.GameObject topWall = new com.thrashplay.jounce.entity.GameObject("topWall");
    topWall.addComponent(new com.thrashplay.jounce.entity.Position(gameBounds.getLeft(), gameBounds.getTop(), gameBounds.getWidth(), 5));
    topWall.addComponent(new com.thrashplay.jounce.entity.RectangleRenderer(-1, true));
    topWall.addComponent(new com.thrashplay.jounce.entity.Collider(CollisionCategory.TOP_WALL, false, new com.thrashplay.luna.api.geom.Rectangle(0, 0, gameBounds.getWidth(), 5)));
    return topWall;
}