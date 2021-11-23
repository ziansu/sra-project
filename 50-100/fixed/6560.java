public void displayTitle() {
    this.getContentPane().removeAll();
    this.add(titleScreen);
    titleScreen.revalidate();
    titleScreen.repaint();
    this.revalidate();
    this.repaint();
    titleScreen.requestFocusInWindow();
}