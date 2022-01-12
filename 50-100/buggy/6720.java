public static javax.swing.JLabel createJLabel(java.lang.String label, int fontSize, boolean border) {
    javax.swing.JLabel comp = new javax.swing.JLabel(label);
    com.tri.pgs.client.surface.ui.UISystem.init(comp, border);
    comp.setFont(new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.BOLD, fontSize));
    return comp;
}