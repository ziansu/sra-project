@java.lang.Override
public java.awt.Component getTreeCellRendererComponent(javax.swing.JTree tree, java.lang.Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
    super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
    if (value instanceof org.openpnp.gui.MachineSetupPanel.PropertySheetHolderTreeNode) {
        org.openpnp.gui.MachineSetupPanel.PropertySheetHolderTreeNode node = ((org.openpnp.gui.MachineSetupPanel.PropertySheetHolderTreeNode) (value));
        org.openpnp.spi.PropertySheetHolder psh = node.getPropertySheetHolder();
        setIcon(psh.getPropertySheetHolderIcon());
    }
    return this;
}