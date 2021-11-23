private void createPlayer() {
    playerTextureName = ("images/textures/objects/" + (playerTextureName)) + ".png";
    player = new Game.PlayerAvatar(playerTextureName, this, gameClient);
    player.translate(3, 0, 3);
    addGameWorldObject(player);
    gameClient.sendCreateMessage(getPosition(), getPlayerTextureName());
}