public org.agilewiki.utils.immutable.collections.VersionedListNode clearList() {
    if (isNil())
        return thisNode;
    
    org.agilewiki.utils.immutable.collections.VersionedListNode ln = leftNode.clearList();
    org.agilewiki.utils.immutable.collections.VersionedListNode rn = rightNode.clearList();
    if (((ln == (leftNode)) && (rn == (rightNode))) && (!(exists(thisNode.getTimestamp()))))
        return thisNode;
    
    return replace(thisNode.getTimestamp(), ln, rn);
}