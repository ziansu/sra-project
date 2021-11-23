public void drawRoute() {
    setShapeRendererColor(Color.WHITE);
    getShapeRenderer().begin(ShapeType.Line);
    for (bachelor.project.nije214.thhym14.Enemy enemy : enemies) {
        com.badlogic.gdx.math.Vector2 previous = getPath().first();
        for (com.badlogic.gdx.math.Vector2 waypoint : getPath()) {
            getShapeRenderer().line(previous, waypoint);
            previous = waypoint;
        }
    }
    getShapeRenderer().end();
}