private void update(float delta) {
    clearDeadBodies();
    world.step(delta, 6, 2);
    body.setAwake(true);
    updateSpritePositions();
    box2dCamera.position.set(((com.nuthrow.game.screens.GameScreen.UNIT_WIDTH) / 2), ((com.nuthrow.game.screens.GameScreen.UNIT_HEIGHT) / 2), 0);
    box2dCamera.update();
}