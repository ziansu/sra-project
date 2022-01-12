public void drawWayPoints() {
    getShapeRenderer().begin(ShapeType.Filled);
    for (com.badlogic.gdx.math.Vector2 waypoint : getPath()) {
        getShapeRenderer().circle(waypoint.x, waypoint.y, 10);
    }
    getShapeRenderer().end();
}