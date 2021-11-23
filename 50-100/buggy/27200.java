public void holeSetting(int gridx, int gridy, int button) {
    java.lang.System.out.println("hole button added");
    holeButtons[button] = new entities.NButton(new javax.swing.JButton(), gridx, gridy);
    holeButtons[button].setBackground(java.awt.Color.GRAY);
    setGridColRow(gridx, gridy);
    panel.add(holeButtons[button], c);
}