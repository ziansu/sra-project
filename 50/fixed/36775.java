@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent key) {
    if ((java.lang.Character.toLowerCase(key.getKeyChar())) == 'g') {
        this.mazeNumber = 0;
        startMazeLevel(mazeNumber);
    }
}