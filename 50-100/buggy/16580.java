public void start() {
    gameEngine.StartingClass.viewframe = new gameEngine.ViewFrame(0, 0, gameEngine.StartingClass.screenSizeX, gameEngine.StartingClass.screenSizeY);
    squad = new gameEngine.Squad();
    try {
        gameEngine.StartingClass.map = new gameEngine.Map("data/map1.txt");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    gameEngine.StartingClass.viewframe.setBoundX(gameEngine.StartingClass.map.getWidth(true));
    gameEngine.StartingClass.viewframe.setBoundY((-(gameEngine.StartingClass.map.getHeight(true))));
    java.lang.Thread thread = new java.lang.Thread(this);
    thread.start();
}