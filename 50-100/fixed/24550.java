public void reset() {
    clear();
    fireHandler = null;
    com.badlogic.gdx.utils.Array<com.mygdx.game.Body> bodies = new com.badlogic.gdx.utils.Array<com.mygdx.game.Body>();
    com.mygdx.game.MainGame.WORLD.getBodies(bodies);
    for (com.mygdx.game.Body body : bodies) {
        destroyJoints(body);
        com.mygdx.game.MainGame.WORLD.destroyBody(body);
    }
    buildHandler.getBridgeUnitLinks().clear();
    buildHandler.getBridgeUnits().clear();
    drawCliffs();
    fireGo();
}