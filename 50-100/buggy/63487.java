public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("Home")) {
        gameWindow.getBoard().thread.stop();
        GameComponents.Game.deadBricks = 0;
        GameComponents.Game.count = 0;
        homeWindow.addLevelChoosePanel();
        cards.show(getContentPane(), "Home");
    }
}