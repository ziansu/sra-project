private static void constructGridable(Gridder.Gridable... argrid) {
    javax.swing.JFrame builder = new javax.swing.JFrame("Builder");
    javax.swing.JPanel pan = new javax.swing.JPanel();
    builder.add(pan);
    builder.setSize(60, 60);
    builder.repaint();
    builder.setVisible(true);
}