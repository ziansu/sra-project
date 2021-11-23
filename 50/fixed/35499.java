public void createPlayableScreen(java.lang.String name) {
    gui.PlayableScreen screen = new gui.PlayableScreen(game, name);
    game.addScreen(screen);
    gameView.addScreen(screen);
    repaint();
}