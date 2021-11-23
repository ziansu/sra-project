public void createAndAddWidgets() {
    this.dataTree = new javax.swing.JTree(this.root);
    this.dataTree.expandRow(0);
    this.dataTree.setRootVisible(false);
    this.dataTree.setEditable(true);
    final javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(this.dataTree);
    scrollPane.setBorder(new javax.swing.border.TitledBorder(OmeroPluginGUIConstants.TREE_TITLE));
    this.add(scrollPane, java.awt.BorderLayout.CENTER);
}