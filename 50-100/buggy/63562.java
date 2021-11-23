private void addJComponent(java.awt.Container container, java.awt.Component component, int gridx, int gridy, int gridwidth, int gridheight, java.awt.Insets insets, int anchor, int fill) {
    java.awt.GridBagConstraints gbc = new java.awt.GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0, anchor, fill, insets, 0, 0);
    container.add(component, gbc);
}