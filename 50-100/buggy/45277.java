public static javax.swing.JButton createJButton(java.lang.String label, int fontSize) {
    javax.swing.JButton comp = new javax.swing.JButton(label);
    com.tri.pgs.client.surface.ui.UISystem.init(comp, true);
    comp.setFont(new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.BOLD, fontSize));
    comp.setMargin(new java.awt.Insets(0, 0, 0, 0));
    comp.setFocusable(false);
    return comp;
}