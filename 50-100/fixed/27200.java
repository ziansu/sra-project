public void holeSetting(int gridx, int gridy, int button) {
    holeButtons[button] = new entities.NButton(new javax.swing.JButton(), gridx, gridy);
    holeButtons[button].setBackground(java.awt.Color.GRAY);
    setGridColRow(gridx, gridy);
    panel.add(holeButtons[button], c);
}