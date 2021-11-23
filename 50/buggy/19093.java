public void updateDisplay() {
    java.lang.System.out.println(this.getHeight());
    java.lang.System.out.println(this.getWidth());
    header.updateDisplay();
    lowerPanel.updateDisplay();
    repaint();
}