public void update(float dt) {
    handleInput(dt);
    java.lang.System.out.print(miner.b2body.getLinearVelocity().y);
    minerPos = miner.b2body.getPosition();
    world.step((1 / 60.0F), 6, 2);
    updateCamera(gameCam, getMapPixelWidth(), getMapPixelHeight());
    renderer.setView(gameCam);
}