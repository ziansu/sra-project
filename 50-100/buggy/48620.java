private static void createBodies(java.lang.Iterable<com.smokebox.lib.utils.geom.Line> edges, com.badlogic.gdx.physics.box2d.World box2dWorld) {
    for (com.smokebox.lib.utils.geom.Line l : edges) {
        com.badlogic.gdx.physics.box2d.EdgeShape edgeShape = new com.badlogic.gdx.physics.box2d.EdgeShape();
        edgeShape.set(l.x, l.y, l.x2, l.y2);
        com.badlogic.gdx.physics.box2d.FixtureDef fixtureDef = new com.badlogic.gdx.physics.box2d.FixtureDef();
        fixtureDef.shape = edgeShape;
        com.badlogic.gdx.physics.box2d.BodyDef bodyDef = new com.badlogic.gdx.physics.box2d.BodyDef();
        bodyDef.type = BodyDef.BodyType.StaticBody;
        com.badlogic.gdx.physics.box2d.Body body = box2dWorld.createBody(bodyDef);
        body.createFixture(fixtureDef);
    }
}