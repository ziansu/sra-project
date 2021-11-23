public void dragOver(java.awt.dnd.DropTargetDragEvent dtde) {
    java.awt.Point dragPoint = dtde.getLocation();
    javax.swing.tree.TreePath path = getPathForLocation(dragPoint.x, dragPoint.y);
    if (path == null)
        dropTargetNode = null;
    else
        dropTargetNode = ((javax.swing.tree.TreeNode) (path.getLastPathComponent()));
    
    javax.swing.JTree tree = ((javax.swing.JTree) (dtde.getDropTargetContext().getComponent()));
    autoscroll(tree, dragPoint);
    repaint();
}