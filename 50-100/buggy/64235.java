public void addProjectButton(javax.swing.JPanel panel) {
    java.awt.GridBagConstraints c = ip.setGrids(2, 0);
    projectButton = ip.createButton("ADD new Project", context.healthinformatics.GUI.InputPageComponents.DIMESIONWIDTH, context.healthinformatics.GUI.InputPageComponents.DIMESIONHEIGHT);
    projectButton.addActionListener(ip);
    c.insets = new java.awt.Insets(context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS);
    c.weightx = 1;
    c.anchor = java.awt.GridBagConstraints.LINE_START;
    panel.add(projectButton, c);
}