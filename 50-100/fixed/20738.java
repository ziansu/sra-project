public static void main(final java.lang.String[] args) throws org.newdawn.slick.SlickException {
    bustamove.App.init();
    org.newdawn.slick.AppGameContainer app = new org.newdawn.slick.AppGameContainer(new bustamove.App("Bust-A-Move!!"));
    app.setDisplayMode(bustamove.App.GAME_WIDTH, bustamove.App.GAME_HEIGHT, false);
    app.setAlwaysRender(true);
    app.setTargetFrameRate(bustamove.App.MAX_FPS);
    bustamove.system.SoundHandler.getInstance().init();
    bustamove.App.highscores = new bustamove.game.Highscore();
    bustamove.App.highscores.setFile(GameConfig.HIGHSCORE_FILE);
    bustamove.App.highscores.load();
    app.start();
}