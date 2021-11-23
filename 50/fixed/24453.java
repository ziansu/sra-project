public void setShape(com.badlogic.gdx.physics.box2d.Shape shape) {
    if ((body) != null) {
        body.destroyFixture(fixture);
        fixtureDef.shape = shape;
        fixture = body.createFixture(fixtureDef);
    }
}