@java.lang.Override
public int getIndex(javax.swing.tree.TreeNode node) {
    java.util.ArrayList items = new java.util.ArrayList();
    items.addAll(traceItems);
    return items.indexOf(node);
}