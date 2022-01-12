public void addAnalyseButton(javax.swing.JPanel panel) {
    analyseButton = ip.createButton("ANALYSE", context.healthinformatics.GUI.InputPageComponents.HELPBUTTONWIDTH, context.healthinformatics.GUI.InputPageComponents.HELPBUTTONHEIGHT);
    analyseButton.addActionListener(this);
    java.awt.GridBagConstraints c = ip.setGrids(0, 0);
    c.weightx = 1;
    c.insets = new java.awt.Insets(context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS, context.healthinformatics.GUI.InputPageComponents.BUTTONINSETS);
    c.anchor = java.awt.GridBagConstraints.EAST;
    panel.add(analyseButton, c);
}