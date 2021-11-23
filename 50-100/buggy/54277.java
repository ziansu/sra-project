private boolean isCoursenable() {
    boolean childrenAreLeaves = children().allMatch(co.jfgreen.quadtree.Node::isLeaf);
    int combinedChildPointCount = children().mapToInt(( c) -> c.points.size()).sum();
    return ((!(isLeaf())) && childrenAreLeaves) && (combinedChildPointCount <= (maxBucketSize));
}