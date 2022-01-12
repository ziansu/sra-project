private void addModulePanel(se.trixon.mapollage.ui.config.ModulePanel modulePanel) {
    tabbedPane.add(modulePanel);
    javax.swing.JLabel label = new javax.swing.JLabel(modulePanel.getTitle(), javax.swing.JLabel.CENTER);
    label.setIconTextGap(4);
    label.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 4, 4, 4));
    tabbedPane.setTabComponentAt(((tabbedPane.getTabCount()) - 1), label);
}