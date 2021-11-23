public void setSize(int width, int height) {
    scrollPane.setPreferredSize(new java.awt.Dimension(width, height));
    scrollPane.setMinimumSize(new java.awt.Dimension(width, height));
    scrollPane.setSize(width, height);
}