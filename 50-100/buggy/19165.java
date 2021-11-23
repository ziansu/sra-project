public void createAssignScreen(java.lang.String name, java.lang.String varName, java.lang.String newValue, java.lang.String newScreen) {
    gui.AssignScreen assign = new gui.AssignScreen(game, name);
    assign.setVariable(varName);
    assign.setNewValue(newValue);
    assign.addOption("default", game.getScreen(newScreen));
    game.addScreen(assign);
    gameView.addScreen(assign);
    gameView.repaint();
}