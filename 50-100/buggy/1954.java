private static int writeCount(org.avidj.zuul.core.LockTreeNode node) {
    assert node != null;
    int count = (node.hasExclusiveLock()) ? 1 : 0;
    for (org.avidj.zuul.core.LockTreeNode child : node.children.values()) {
        count += org.avidj.zuul.core.DefaultLockManager.writeCount(child);
    }
    assert count == (node.writes) : java.lang.String.format("node = %1$s, writes = %2$d, actual = %3$d", org.avidj.util.Strings.join(org.avidj.zuul.core.DefaultLockManager.pathTo(node)), node.writes, count);
    return count;
}