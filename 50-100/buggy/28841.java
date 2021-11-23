public void startGame(java.util.HashMap<java.lang.Integer, java.lang.Integer> playerIdTypeMap, java.lang.Integer id) {
    model.setMyID(id);
    model.init(playerIdTypeMap);
    model.generateWorld();
    model.setIsClient();
    init();
    com.technohest.core.menu.ScreenHandler.getInstance().setGameScreen(view);
    com.technohest.core.menu.ScreenHandler.getInstance().setScreen(SCREEN.GAME);
    com.esotericsoftware.minlog.Log.info("STARTING GAME ON CLIENT.");
}