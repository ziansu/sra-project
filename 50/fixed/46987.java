@java.lang.Override
public void keyReleased(java.awt.event.KeyEvent e) {
    player.keyReleased(e);
    editorPanel.keyReleased(e);
    editorPanel.getWorldGeom().keyReleased(e);
}