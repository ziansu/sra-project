public static void main(java.lang.String[] args) {
    logger.Log.debugEnabled = false;
    logger.Log.infoEnabled = true;
    logger.Log.debug("Warming up.");
    main.Main.launch();
    logger.Log.debug("Ready to go!");
    try {
        game.Game.getInstance().gameLoop(main.Main.fps);
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
        logger.Log.warn(e.getMessage());
    }
}