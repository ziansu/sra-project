private void initLeft(com.badlogic.gdx.utils.viewport.Viewport viewport, com.badlogic.gdx.physics.box2d.World world) {
    com.badlogic.gdx.physics.box2d.BodyDef bodyDefinition = new com.badlogic.gdx.physics.box2d.BodyDef();
    bodyDefinition.position.set(0, 0);
    com.badlogic.gdx.physics.box2d.Body b2body = world.createBody(bodyDefinition);
    bodyDefinition.type = BodyDef.BodyType.StaticBody;
    com.badlogic.gdx.physics.box2d.FixtureDef fixtureDefinition = new com.badlogic.gdx.physics.box2d.FixtureDef();
    com.badlogic.gdx.physics.box2d.PolygonShape shape = new com.badlogic.gdx.physics.box2d.PolygonShape();
    fixtureDefinition.shape = shape;
    b2body.createFixture(fixtureDefinition);
    b2body.createFixture(fixtureDefinition);
    b2body.createFixture(fixtureDefinition);
    b2body.toString();
    shape.dispose();
}