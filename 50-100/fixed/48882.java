public void installUI(javax.swing.JComponent c) {
    super.installUI(c);
    borderShape = new java.awt.geom.RoundRectangle2D.Float(0, 0, 0, 0, 8, 8);
    handle = createFocusHandle();
    c.addMouseListener(handle);
    c.addFocusListener(handle);
}