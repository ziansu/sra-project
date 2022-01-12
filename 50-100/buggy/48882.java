public void installUI(javax.swing.JComponent c) {
    super.installUI(c);
    javax.swing.LookAndFeel.installProperty(c, "opaque", java.lang.Boolean.FALSE);
    contentShape = new java.awt.geom.RoundRectangle2D.Float(0, 0, 0, 0, 8, 8);
    borderShape = new java.awt.geom.RoundRectangle2D.Float(0, 0, 0, 0, 8, 8);
    handle = createFocusHandle();
    c.addMouseListener(handle);
    c.addFocusListener(handle);
}