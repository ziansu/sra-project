public void init() {
    display = new dev.Same4254.ThisGame.dis.Display(this, title, width, height);
    addMouseListener(mouseManager);
    addMouseMotionListener(mouseManager);
    dev.Same4254.ThisGame.gfx.Assets.init();
    gameState = new dev.Same4254.ThisGame.States.GameState(this);
    menuState = new dev.Same4254.ThisGame.States.MenuState(this);
    dev.Same4254.ThisGame.States.State.setCurrentState(gameState);
    update();
}