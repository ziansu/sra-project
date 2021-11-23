private void selectTreeMethod(org.objectweb.asm.tree.ClassNode cn, org.objectweb.asm.tree.MethodNode mn) {
    new java.lang.Thread(() -> {
        javax.swing.tree.DefaultTreeModel tm = ((javax.swing.tree.DefaultTreeModel) (fileTree.getModel()));
        this.selectEntry(mn, tm, ((me.noverify.utils.SortedTreeNode) (tm.getRoot())));
    }).start();
}