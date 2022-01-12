private void createPlayer() {
    player = gameCharFac.createCharacter("Civilian", 0, world);
    player.getBody().getFixtureList().get(0).setUserData("player");
    player.spawn(1010, 515, 0);
}