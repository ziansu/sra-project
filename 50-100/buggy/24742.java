protected void drawCircleFixture(javafx.scene.canvas.GraphicsContext gc, org.jbox2d.dynamics.Fixture fixture) {
    org.jbox2d.collision.shapes.CircleShape circle = ((org.jbox2d.collision.shapes.CircleShape) (fixture.getShape()));
    org.jbox2d.common.Vec2 fixturePos = new org.jbox2d.common.Vec2(body.getPosition().x, ((body.getPosition().y) - (circle.m_p.y)));
    java.lang.Float radious = fixture.getShape().getRadius();
    drawCircle(gc, fixturePos, radious.doubleValue());
}