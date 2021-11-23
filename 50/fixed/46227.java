@java.lang.Override
public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    setBackground(getColor());
    lblValue.setText(tile.toString());
}