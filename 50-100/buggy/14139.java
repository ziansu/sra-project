public static long getMaxId(final org.osate.ge.internal.diagram.runtime.boTree.BusinessObjectNode n) {
    long max = -1;
    if ((n.getId()) != null) {
        max = java.lang.Math.max(max, n.getId());
    }
    java.lang.Math.max(max, org.osate.ge.internal.diagram.runtime.boTree.BusinessObjectNode.getMaxIdForChildren(n));
    return max;
}