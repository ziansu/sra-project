public void update(float dt) {
    world.step((1 / 60.0F), 6, 2);
    handleInput(dt);
    gamecam.update();
    renderer.setView(gamecam);
    b2dr.render(world, gamecam.combined);
}