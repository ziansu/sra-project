public javax.swing.JComboBox<java.lang.String> personCombo() {
    javax.swing.JComboBox<java.lang.String> box = new javax.swing.JComboBox<java.lang.String>();
    for (Players.Player p : board.getPlayers()) {
        box.addItem(p.getName());
    }
    box.setBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EtchedBorder(), "Person Guess"));
    box.setLayout(new java.awt.GridLayout(1, 1));
    return box;
}