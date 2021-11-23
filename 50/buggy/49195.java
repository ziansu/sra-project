public void closeUpgradeOverlay() {
    upgradeOverlayVisible = false;
    Gdx.input.setInputProcessor(gameStage);
    engine.testTrade();
}