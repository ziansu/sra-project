public org.agilewiki.utils.immutable.collections.VersionedListNode replace(int level, int totalSize) {
    thisNode.releaseLocal();
    return new org.agilewiki.utils.immutable.collections.VersionedListNodeImpl(thisNode.getRegistry(), level, totalSize, created, deleted, leftNode, value, rightNode);
}