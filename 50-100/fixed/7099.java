public void checkForLevelFinished() {
    if (objDim.collisionCheck(player, door)) {
        c.resetLevel();
        runTimer = false;
        leftPressed = false;
        rightPressed = false;
        spacePressed = false;
        settings.Settings.beatLevel(level, time.getText());
        this.add(beatLevelPanel);
        beatLevelPanel.repaint();
        beatLevelPanel.revalidate();
    }
}