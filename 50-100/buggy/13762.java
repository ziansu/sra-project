public void createCondScreen(java.lang.String name, java.lang.String pred, java.lang.String trueScreen, java.lang.String falseScreen) {
    gui.CondScreen cond = new gui.CondScreen(game, name);
    cond.setPred(pred);
    cond.addOption("true", game.getScreen(trueScreen));
    cond.addOption("false", game.getScreen(falseScreen));
    game.addScreen(cond);
    gameView.addScreen(cond);
    gameView.repaint();
}