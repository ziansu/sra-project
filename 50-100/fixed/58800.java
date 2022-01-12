private void refresh() {
    for (com.badlogic.gdx.physics.box2d.Body key : bodyMap.keySet()) {
        world.destroyBody(key);
    }
    world.destroyBody(plat.bod1);
    world.destroyBody(plat.bod2);
    plat = new com.mygdx.magicappgame.Shapes.BalancePlatform(world);
    bodyMap.clear();
    stage.clear();
    startSound.dispose();
    hud.resetLevel();
    hud.resetBox();
    currentLevel.count = 0;
    firstDraw = true;
    moveAllowed = true;
}