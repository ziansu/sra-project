public void run() {
    while (logicThread.isAlive()) {
        repaint();
        try {
            java.lang.Thread.sleep(10);
        } catch (java.lang.InterruptedException e) {
        }
    } 
    self.remove(game);
    ScreenState.presentScreen = ScreenState.REFRESH_TITLE;
    java.lang.System.out.println("Hey");
    game = null;
}