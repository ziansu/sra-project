@java.lang.Override
public void run() {
    gui.setBufferedImage(work);
    gui.setScale(controlPanel.getZoom());
    gui.repaint();
    gui.requestFocusInWindow();
}