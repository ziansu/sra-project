public void dragGestureRecognized(java.awt.dnd.DragGestureEvent dge) {
    java.awt.datatransfer.Transferable trans = new com.qspin.qtaste.ui.TestCaseTree.TCTreeNodeTransferable(this.getSelectionPath().getLastPathComponent());
    ds.startDrag(dge, null, trans, this);
}