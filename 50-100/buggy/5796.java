public static final void start(sk.game.GameProperties properties) {
    sk.game.Game.properties = properties;
    sk.game.Window.create();
    sk.game.Game.initGL();
    sk.game.Window.show();
    sk.gamestate.GameStateManager.enterState(properties.startState);
    sk.game.Game.running = true;
    while ((!(sk.game.Window.shouldClose())) && (sk.game.Game.running))
        sk.game.Game.loop();
    
    sk.game.Game.destroy();
}