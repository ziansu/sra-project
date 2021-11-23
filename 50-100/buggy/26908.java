@java.lang.Override
protected void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    int position = getStartPos();
    for (int i = 0; i < 10; i++) {
        position = drawOctave(g, position, this.notes.getOrDefault(i, null));
    }
}