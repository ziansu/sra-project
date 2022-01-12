public void checkForLevelFinished() {
    if (objDim.collisionCheck(player, door)) {
        c.resetLevel();
        runTimer = false;
        leftPressed = false;
        rightPressed = false;
        spacePressed = false;
        settings.Settings.beatLevel(level, java.lang.Double.parseDouble(time.getText()));
        this.add(beatLevelPanel);
        beatLevelPanel.repaint();
        beatLevelPanel.revalidate();
    }
}