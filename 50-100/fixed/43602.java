public void update(float delta) {
    handleInput();
    cam.update();
    gameWORLD.step(Gdx.graphics.getDeltaTime(), 8, 2);
    player.setPosition(player.playerBody.getPosition().x, player.playerBody.getPosition().y);
    playerLight.updateLightPos(player.playerBody.getPosition().x, player.playerBody.getPosition().y);
    playerLight.rayHandler.update();
    zombie.update(delta);
}