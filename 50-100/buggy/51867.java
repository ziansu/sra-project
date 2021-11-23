public static void main(java.lang.String[] argv) {
    try {
        boolean vSync = false;
        com.ellisbarnes.OpenGL.engine.IGameLogic gameLogic = new com.ellisbarnes.OpenGL.DummyGame();
        com.ellisbarnes.OpenGL.engine.GameEngine gameEngine = new com.ellisbarnes.OpenGL.engine.GameEngine("GAME", 600, 480, vSync, gameLogic);
        gameEngine.run();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        java.lang.System.exit((-1));
    }
}