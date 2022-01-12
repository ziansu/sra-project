protected void handleStateNew() {
    levelRenderer.renderNew();
    if (checkForStartKey()) {
        state = sem.group15.bubblebobble.core.GameController.GameState.PLAY;
        startLevel(currentLevelNumber);
    }
}