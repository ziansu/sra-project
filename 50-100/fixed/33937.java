protected static void writeName(java.lang.String nickname) {
    java.awt.Font font = new java.awt.Font("Open Sans", java.awt.Font.PLAIN, 12);
    javax.swing.JLabel name = new javax.swing.JLabel(nickname);
    name.setBounds(20, 115, 100, 22);
    name.setFont(font);
    name.setForeground(new java.awt.Color(255, 255, 255, 255));
    it.polimi.ingsw.cg_23.gui.StartingTable.layeredPane.add(name);
    it.polimi.ingsw.cg_23.gui.StartingTable.layeredPane.setLayer(name, it.polimi.ingsw.cg_23.gui.StartingTable.LAYER_GAME);
    name.setVisible(true);
}