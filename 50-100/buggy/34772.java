private void clearWorld() {
    ballsBodies.clear();
    ballsSprites.clear();
    java.util.Iterator<com.badlogic.gdx.physics.box2d.Body> bodies = null;
    world.getBodies(((com.badlogic.gdx.utils.Array<com.badlogic.gdx.physics.box2d.Body>) (bodies)));
    while (bodies.hasNext())
        world.destroyBody(bodies.next());
    
}