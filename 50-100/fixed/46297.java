protected javax.swing.JPanel buildTagTableEditorPanel() {
    javax.swing.JPanel pnl = new javax.swing.JPanel();
    pnl.setLayout(new java.awt.BorderLayout());
    pnl.add(new javax.swing.JScrollPane(tagTable), java.awt.BorderLayout.CENTER);
    if ((presetHandler) != null) {
        presetListPanel = new org.openstreetmap.josm.gui.dialogs.properties.PresetListPanel();
        pnl.add(presetListPanel, java.awt.BorderLayout.NORTH);
    }
    return pnl;
}