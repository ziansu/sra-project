public void removeSetUp() {
    this.remove(this.c1);
    this.remove(this.gameField1);
    this.repaint();
    this.add(this.gameField2, java.awt.BorderLayout.CENTER);
    this.gameField1.updateSize();
    this.gameField2.updateSize();
    this.repaint();
}