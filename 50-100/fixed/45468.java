public void update(float dt) {
    player.update(dt);
    handleInput(dt);
    gamecam.position.x = player.b2body.getPosition().x;
    gamecam.position.y = player.b2body.getPosition().y;
    gamecam.update();
    world.step((1 / 60.0F), 1, 2);
    renderer.setView(gamecam);
}