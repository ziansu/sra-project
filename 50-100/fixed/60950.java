public void showMenu() {
    inputManager.setCursorVisible(true);
    menu.switchScreen("start");
    if ((audioMosquito) != null)
        audioMosquito.pause();
    
    guiNode.detachChild(guiOverlay.getObjectiveText());
    guiNode.detachChild(guiOverlay.getBloodText());
    guiNode.detachChild(guiOverlay.getScoreText());
    guiNode.detachChild(guiOverlay.getEnergyText());
    guiNode.detachChild(guiOverlay.getRewardText());
}