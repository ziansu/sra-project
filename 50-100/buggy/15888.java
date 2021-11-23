private void doPause() {
    pauseMenu = new GamePauseMenu();
    pauseMenu.init(this);
    mainFrame.remove(mainPanel);
    mainFrame.add(pauseMenu, java.awt.BorderLayout.CENTER);
    mainFrame.revalidate();
    pauseMenu.repaint();
    timer.stop();
    mainPanel.removeMouseListener(mouseListener);
    mainPanel.removeMouseMotionListener(mouseListener);
    mainPanel.removeKeyListener(keyListener);
    AudioPlayer.pauseLongAudio(map.getAudio());
}