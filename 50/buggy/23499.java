@java.lang.Override
public void cover() {
    updater.stop();
    game.InputManager.reset();
    ui.switchTo(GamePanel.LOAD_PANEL);
}