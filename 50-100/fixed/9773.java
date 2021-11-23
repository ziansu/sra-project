public void update(float dt) {
    handleInput(dt);
    minerPos = miner.b2body.getPosition();
    world.step((1 / 60.0F), 6, 2);
    updateCamera(gameCam, getMapPixelWidth(), getMapPixelHeight());
    renderer.setView(gameCam);
}