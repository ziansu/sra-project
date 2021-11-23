@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    inGame();
    repaint();
    updateAliens();
    checkCollisions();
}