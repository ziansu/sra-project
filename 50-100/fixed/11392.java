public static void main(java.lang.String[] args) throws org.newdawn.slick.SlickException {
    org.newdawn.slick.AppGameContainer game = new org.newdawn.slick.AppGameContainer(new graphique.StateGame(), graphique.StateGame.width, graphique.StateGame.height, false);
    game.setTargetFrameRate(60);
    game.setShowFPS(true);
    game.start();
}