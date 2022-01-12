@java.lang.Override
public void render() {
    super.render();
    if ((!(com.pucpr.game.PlayerStatus.isKey(Keys.RUSH_TEST_DONE))) && (gameState.getScreenInfo().isTimeOver())) {
        final com.pucpr.game.states.game.locations.TutorialScreen prevScreen = new com.pucpr.game.states.game.locations.TutorialScreen();
        gameState.setScreen(prevScreen);
        prevScreen.movePlayerToGate(TutorialScreen.GATE_2);
    }
}