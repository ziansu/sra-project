private static int readCount(org.avidj.zuul.core.LockTreeNode node) {
    int count = node.getSharedLocks().size();
    for (org.avidj.zuul.core.LockTreeNode child : node.children.values()) {
        count += org.avidj.zuul.core.DefaultLockManager.readCount(child);
    }
    assert count == (node.reads) : java.lang.String.format("node = %1$s, reads = %2$d, actual = %3$d", org.avidj.util.Strings.join(org.avidj.zuul.core.DefaultLockManager.pathTo(node)), node.reads, count);
    return count;
}