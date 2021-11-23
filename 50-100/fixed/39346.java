public void update(float dt) {
    handleInput(dt);
    world.step((1 / 60.0F), 6, 2);
    gamecam.update();
    renderer.setView(gamecam);
    b2dr.render(world, gamecam.combined);
}