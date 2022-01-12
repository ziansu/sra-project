@java.lang.Override
protected void setUp(com.github.pelep.spaceinvaders.Input input) {
    pauseKey = input.getButton(java.awt.event.KeyEvent.VK_ESCAPE);
    level = new com.github.pelep.spaceinvaders.play.Level(game, input);
    game.queuePush(new com.github.pelep.spaceinvaders.play.StandbyState(StandbyState.START_MESSAGE));
}