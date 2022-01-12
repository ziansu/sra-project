protected javax.swing.JPanel createWorldMap() {
    worldMap.setLayout(new java.awt.GridLayout(civ.gui.View.rows, civ.gui.View.cols));
    worldMap.setSize(((civ.gui.View.cols) * 15), ((civ.gui.View.rows) * 15));
    worldMap.setVisible(true);
    worldMap.requestFocus(true);
    worldMap.repaint();
    return worldMap;
}