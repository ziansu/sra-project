private void clearWorld() {
    ballsBodies.clear();
    ballsSprites.clear();
    com.badlogic.gdx.utils.Array<com.badlogic.gdx.physics.box2d.Body> bodies = new com.badlogic.gdx.utils.Array();
    world.getBodies(bodies);
    for (com.badlogic.gdx.physics.box2d.Body b : bodies)
        world.destroyBody(b);
    
}