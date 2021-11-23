private void setAbsoluteSize(javax.swing.JComponent comp, int width, int height) {
    java.awt.Dimension d = new java.awt.Dimension(width, height);
    comp.setPreferredSize(d);
    comp.setMinimumSize(d);
    comp.setMaximumSize(d);
}