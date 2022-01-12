@java.lang.Override
public void update() {
    keyManager.updateKeyStates();
    if (keyManager.isKeyPressed(java.awt.event.KeyEvent.VK_ESCAPE))
        stateManager.schedulePush(com.github.pelep.spaceinvaders.state.PAUSED);
    
    game.getLevel().update();
}