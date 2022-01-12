public void update(float dt) {
    player.update(dt);
    handleInput(dt);
    world.step((1 / 60.0F), 1, 2);
    gamecam.position.x = player.b2body.getPosition().x;
    gamecam.position.y = player.b2body.getPosition().y;
    gamecam.update();
    renderer.setView(gamecam);
}