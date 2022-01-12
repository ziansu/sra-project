public static javax.swing.JMenuItem createJMenuItem(java.lang.String name, java.lang.String description, javax.swing.KeyStroke keyStroke) {
    javax.swing.JMenuItem comp = new javax.swing.JMenuItem(name);
    if (keyStroke != null)
        comp.setAccelerator(keyStroke);
    
    if (description != null)
        comp.setToolTipText(description);
    
    comp.setFont(new java.awt.Font(java.awt.Font.SANS_SERIF, java.awt.Font.BOLD, 14));
    com.tri.pgs.client.surface.ui.UISystem.init(comp, false);
    return comp;
}