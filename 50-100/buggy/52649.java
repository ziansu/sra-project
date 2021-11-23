public void addFileButton(javax.swing.JPanel panel) {
    java.awt.GridBagConstraints c = ip.setGrids(context.healthinformatics.GUI.InputPageComponents.THREE, 0);
    fileButton = ip.createButton("ADD new File", context.healthinformatics.GUI.InputPageComponents.DIMESIONWIDTH, context.healthinformatics.GUI.InputPageComponents.DIMESIONHEIGHT);
    fileButton.addActionListener(ip);
    c.insets = new java.awt.Insets(context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS);
    c.weightx = 1;
    c.anchor = java.awt.GridBagConstraints.LINE_START;
    panel.add(fileButton, c);
}