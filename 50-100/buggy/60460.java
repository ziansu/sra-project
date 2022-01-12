private javax.swing.JPanel getComponent() {
    javax.swing.JPanel c = new javax.swing.JPanel(new java.awt.GridLayout(1, 0));
    c.setBorder(new javax.swing.border.TitledBorder("View"));
    if ((view) != null) {
        c.add(view);
    }
    c.setSize(640, 480);
    return c;
}