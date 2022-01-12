public void drawWayPoints() {
    getShapeRenderer().begin(ShapeType.Filled);
    for (bachelor.project.nije214.thhym14.Enemy enemy : getEnemyArray()) {
        for (com.badlogic.gdx.math.Vector2 waypoint : getPath()) {
            getShapeRenderer().circle(waypoint.x, waypoint.y, 10);
        }
    }
    getShapeRenderer().end();
}