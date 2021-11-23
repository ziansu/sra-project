@java.lang.Override
public void run() {
    this.addKeyListener(new GamePanel.keysPressed());
    this.setFocusable(true);
    runGame();
}