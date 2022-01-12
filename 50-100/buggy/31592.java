public void collapseAll() {
    super.collapseAll();
    org.jdesktop.swingx.treetable.MutableTreeTableNode root = ((org.jdesktop.swingx.treetable.MutableTreeTableNode) (getTreeTableModel().getRoot()));
    if (root == null)
        return ;
    
    for (org.jdesktop.swingx.treetable.MutableTreeTableNode node : ((org.openmicroscopy.shoola.util.ui.treetable.model.OMETreeNode) (root)).getChildList())
        ((org.openmicroscopy.shoola.util.ui.treetable.model.OMETreeNode) (node)).setExpanded(true);
    
}