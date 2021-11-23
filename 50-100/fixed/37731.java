@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    com.jhash.oimadmin.ui.ConnectionTreeNode.logger.trace("Processing action on menu {} ", newConnectionMenuItem);
    com.jhash.oimadmin.ui.ConnectionDetails connectionDetailUI = new com.jhash.oimadmin.ui.ConnectionDetails("New Connection...", configuration, selectionTree, displayArea);
    connectionDetailUI.initialize();
    displayArea.add(connectionDetailUI);
    com.jhash.oimadmin.ui.ConnectionTreeNode.logger.trace("Processed action on menu {} ", newConnectionMenuItem);
}