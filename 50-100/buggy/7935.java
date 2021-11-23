private void init() {
    display = new com.codeclan.display.Display(title, width, height);
    display.getJFrame().addKeyListener(keyManager);
    com.codeclan.gfx.Assets.init();
    gameCamera = new com.codeclan.gfx.GameCamera(this, 100, 200);
    handler = new com.codeclan.Handler(this);
    gameStates = new com.codeclan.state.GameState(handler);
    menuState = new com.codeclan.state.MenuState(handler);
    settingsState = new com.codeclan.state.SettingsState(handler);
    com.codeclan.state.State.setState(gameStates);
}