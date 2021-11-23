public be.ac.umons.bsp.BSPNode createTree(java.util.List<be.ac.umons.bsp.Segment> segmentList) {
    be.ac.umons.bsp.Segment firstLineInList = segmentList.get(0);
    segmentList.remove(0);
    be.ac.umons.bsp.BSPNode root = new be.ac.umons.bsp.BSPNode(null, null, segmentList, firstLineInList);
    createRoot(root);
    return root;
}