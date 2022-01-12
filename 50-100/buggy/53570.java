public void doUnpause() {
    mainFrame.remove(pauseMenu);
    mainFrame.add(mainPanel, java.awt.BorderLayout.CENTER);
    mainFrame.revalidate();
    AudioPlayer.resumeLongAudio(map.getAudio());
    mainPanel.addMouseListener(mouseListener);
    mainPanel.addMouseMotionListener(mouseListener);
    mainPanel.addKeyListener(keyListener);
    timer.start();
}