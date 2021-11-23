public static void main(java.lang.String[] args) {
    java.lang.System.out.println("Hello World");
    FTSimulationGame.save = new arcircle.ftsim.save.Save();
    org.newdawn.slick.AppGameContainer app;
    try {
        app = new org.newdawn.slick.AppGameContainer(new arcircle.ftsim.main.FTSimulationGame(FTSimulationGame.GAMENAME));
        app.setDisplayMode(FTSimulationGame.WIDTH, FTSimulationGame.HEIGHT, false);
        app.setTargetFrameRate(FTSimulationGame.FPS);
        app.setShowFPS(false);
        app.start();
    } catch (org.newdawn.slick.SlickException e) {
        e.printStackTrace();
    }
}