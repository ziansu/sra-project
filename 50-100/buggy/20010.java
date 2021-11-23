private void createPlayer() {
    com.jkjk.GameWorld.f3013fbe4bb5fe634bf6835181abec41b182d7e9 player = gameCharFac.createCharacter("Civilian", 0, world);
    player.getBody().getFixtureList().get(0).setUserData("player");
    player.spawn(1010, 515, 0);
}