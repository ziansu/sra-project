public void run() {
    if (getGameOverStatus()) {
        UI.toggleMenuState();
        paused = true;
    }
    if (!(paused)) {
        UI.update();
        game.update();
        redrawUI();
    }
}