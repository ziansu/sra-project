public void run() {
    if (getGameOverStatus()) {
        paused = true;
        UI.toggleMenuState();
    }
    if (!(paused)) {
        UI.update();
        game.update();
        redrawUI();
    }else {
    }
}