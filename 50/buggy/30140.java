private void putOnTop() {
    uploadWindow.setVisible(true);
    uploadWindow.setAlwaysOnTop(true);
    uploadWindow.toFront();
    uploadWindow.requestFocus();
    uploadWindow.repaint();
    uploadWindow.setAlwaysOnTop(false);
}