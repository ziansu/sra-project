@java.lang.Override
public void create() {
    metro.METRO.__controlActionManager = new metro.WindowControls.ControlActionManager();
    metro.GameScreen.GameScreen.setActionManager(metro.METRO.__controlActionManager);
    metro.METRO.__debug = true;
    _oldMousePosition = new java.awt.Point(0, 0);
    metro.METRO.__SCREEN_SIZE.height -= metro.METRO.__titleBarHeight;
    metro.METRO.__titleBarBorderLineWidth = 1;
    metro.METRO.__dragMode = false;
    detectOS();
    initGdx();
    loadVisuals();
    initWindowStuff();
    metro.METRO.__currentGameScreen = new metro.GameScreen.MainMenu();
    metro.METRO.__gameState = metro.GameState.getInstance();
}