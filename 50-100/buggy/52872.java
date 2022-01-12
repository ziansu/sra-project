@java.lang.Override
public org.avidj.zuul.core.LockTreeNode visit(org.avidj.zuul.core.LockTreeNode node) {
    synchronized(node.mutex) {
        (node.writes)--;
        if ((node.subtreeEmpty()) && ((node.parent) != null)) {
            node.parent.children.remove(node.key);
            return null;
        }
        return node;
    }
}