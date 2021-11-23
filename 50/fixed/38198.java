public org.agilewiki.utils.immutable.collections.VersionedListNode replace(long deleted, org.agilewiki.utils.immutable.collections.VersionedListNode leftNode, org.agilewiki.utils.immutable.collections.VersionedListNode rightNode) {
    thisNode.releaseLocal();
    return new org.agilewiki.utils.immutable.collections.VersionedListNodeImpl(thisNode.getRegistry(), level, totalSize, created, deleted, leftNode, value, rightNode);
}