private void centerOnScreen() {
    java.awt.Dimension dim = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
    int w = this.getSize().width;
    int h = this.getSize().height;
    int x = ((dim.width) - w) / 2;
    int y = ((dim.height) - h) / 2;
    this.setLocationRelativeTo(null);
    this.setLocationRelativeTo(replicatorg.app.Base.getMainWindow());
}