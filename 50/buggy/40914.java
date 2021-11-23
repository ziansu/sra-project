public void init() {
    super.init();
    GuiWorld.world = WorldGenerator.generateWorld(gameSettings, 10, 20, playerCount, playerCharacters);
}