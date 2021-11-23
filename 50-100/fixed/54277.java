private boolean isCoursenable() {
    if (isLeaf()) {
        return false;
    }else {
        boolean childrenAreLeaves = children().allMatch(co.jfgreen.quadtree.Node::isLeaf);
        int combinedChildPointCount = children().mapToInt(( c) -> c.points.size()).sum();
        return childrenAreLeaves && (combinedChildPointCount <= (maxBucketSize));
    }
}