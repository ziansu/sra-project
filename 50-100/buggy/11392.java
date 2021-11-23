public static void main(java.lang.String[] args) throws org.newdawn.slick.SlickException {
    app.setTargetFrameRate(60);
    org.newdawn.slick.AppGameContainer game = new org.newdawn.slick.AppGameContainer(new graphique.StateGame(), graphique.StateGame.width, graphique.StateGame.height, false);
    game.setShowFPS(true);
    game.start();
}