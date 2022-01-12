protected void adjustTree(final org.bboxdb.storage.sstable.spatialindex.rtree.RTreeDirectoryNode insertedNode) {
    if (insertedNode == null) {
        return ;
    }
    org.bboxdb.storage.sstable.spatialindex.rtree.RTreeDirectoryNode nodeToCheck = insertedNode;
    do {
        if ((nodeToCheck.getSize()) > (MAX_SIZE)) {
            nodeToCheck = splitNode(insertedNode);
        }
        nodeToCheck = nodeToCheck.getParentNode();
    } while (nodeToCheck != null );
}