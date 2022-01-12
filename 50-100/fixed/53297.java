@java.lang.Override
public final void actionPerformed(final java.awt.event.ActionEvent event) {
    final javax.swing.tree.DefaultMutableTreeNode selected = ((javax.swing.tree.DefaultMutableTreeNode) (xyz.algogo.desktop.frames.EditorFrame.tree.getSelectionPaths()[0].getLastPathComponent()));
    final javax.swing.tree.DefaultMutableTreeNode parent = ((javax.swing.tree.DefaultMutableTreeNode) (selected.getParent()));
    if (xyz.algogo.desktop.utils.AlgorithmTree.up(parent, parent.getIndex(selected))) {
        algorithmChanged(true, true, parent, new javax.swing.tree.TreePath(selected.getPath()));
    }
}