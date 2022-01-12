public int remove(java.lang.String toRemove) {
    linked_yarn.LinkedYarn.Node nodeToRemoveFrom = findFirstNodeWith(toRemove);
    if (nodeToRemoveFrom != null) {
        (modCount)++;
        (nodeToRemoveFrom.count)--;
        (size)--;
        if ((nodeToRemoveFrom.count) == 0) {
            destroyNode(nodeToRemoveFrom);
            return 0;
        }
        return nodeToRemoveFrom.count;
    }else {
        return 0;
    }
}