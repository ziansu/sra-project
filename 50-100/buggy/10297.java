public void addSelectButton(javax.swing.JPanel panel) {
    java.awt.GridBagConstraints c = ip.setGrids(2, 0);
    selectButton = ip.createButton("SELECT", context.healthinformatics.GUI.InputPageComponents.DIMESIONWIDTH, context.healthinformatics.GUI.InputPageComponents.DIMESIONHEIGHT);
    selectButton.addActionListener(ip);
    c.insets = new java.awt.Insets(context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS);
    panel.add(selectButton, c);
}