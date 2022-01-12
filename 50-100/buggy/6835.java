@java.lang.Override
public void dragOver(java.awt.dnd.DropTargetDragEvent e) {
    java.awt.Point cursorLocationBis = e.getLocation();
    javax.swing.tree.TreePath destinationPath = getPathForLocation(cursorLocationBis.x, cursorLocationBis.y);
    if (isDroppable(destinationPath, selectedTreePath)) {
        e.acceptDrag(java.awt.dnd.DnDConstants.ACTION_MOVE);
        setCursor(org.openflexo.gina.swing.view.widget.JFIBBrowserWidget.DnDJTree.dropOK);
    }else {
        e.rejectDrag();
        setCursor(org.openflexo.gina.swing.view.widget.JFIBBrowserWidget.DnDJTree.dropKO);
    }
}