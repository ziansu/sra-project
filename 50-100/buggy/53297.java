@java.lang.Override
public final void actionPerformed(final java.awt.event.ActionEvent event) {
    final javax.swing.tree.DefaultMutableTreeNode selected = ((javax.swing.tree.DefaultMutableTreeNode) (xyz.algogo.desktop.frames.EditorFrame.tree.getSelectionPaths()[0].getLastPathComponent()));
    final javax.swing.tree.DefaultMutableTreeNode parent = ((javax.swing.tree.DefaultMutableTreeNode) (selected.getParent()));
    if (xyz.algogo.desktop.utils.AlgorithmTree.up(parent, parent.getIndex(selected))) {
        xyz.algogo.desktop.utils.Utils.reloadTree(xyz.algogo.desktop.frames.EditorFrame.tree, parent);
        xyz.algogo.desktop.frames.EditorFrame.tree.setSelectionPath(new javax.swing.tree.TreePath(selected.getPath()));
        algorithmChanged(true);
    }
}