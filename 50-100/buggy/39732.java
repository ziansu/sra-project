@java.lang.Override
public void perform(org.apache.pivot.wtk.Component source) {
    facade.removeNode(((org.apache.pivot.wtk.content.TreeNode) (treeView.getSelectedNode())));
    ngdialog.setHierarchy(false, "");
    tableView.clearSelection();
    tableView.repaint(tableView.getColumnBounds(dcp.gui.pivot.frames.SetFrame.TABLEVIEW_GROUP_COLUMN_INDEX));
}