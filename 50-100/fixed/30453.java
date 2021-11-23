private com.badlogic.gdx.physics.box2d.Body _loadBodyFromPolyline(com.badlogic.gdx.maps.MapObject object) {
    com.badlogic.gdx.physics.box2d.BodyDef bodyDef = new com.badlogic.gdx.physics.box2d.BodyDef();
    bodyDef.position.set(0, 0);
    bodyDef.type = com.badlogic.gdx.physics.box2d.BodyDef.BodyType.StaticBody;
    com.badlogic.gdx.physics.box2d.FixtureDef fixtureDef = misc.Utils.getFixtureDefFromBodySkeleton(object);
    com.badlogic.gdx.physics.box2d.Body body = misc.Globals.getPhysicsWorld().createBody(bodyDef);
    body.createFixture(fixtureDef);
    fixtureDef.shape.dispose();
    return body;
}