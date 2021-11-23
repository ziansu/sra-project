public int remove(java.lang.String toRemove) {
    linked_yarn.LinkedYarn.Node nodeToRemoveFrom = this.findFirstNodeWith(toRemove);
    if (nodeToRemoveFrom != null) {
        (this.modCount)++;
        (nodeToRemoveFrom.count)--;
        (this.size)--;
        if ((nodeToRemoveFrom.count) == 0) {
            this.destroyNode(nodeToRemoveFrom);
            return 0;
        }
        return nodeToRemoveFrom.count;
    }else {
        return 0;
    }
}