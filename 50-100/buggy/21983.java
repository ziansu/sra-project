public void nodeFission() {
    for (vo.Node outNode : this.out) {
        outNode.flattenParents();
    }
    for (vo.Node outNode : this.out) {
        outNode.nodeFussion();
    }
    for (vo.Node outNode : this.out) {
        outNode.childrenFission();
    }
    for (vo.Node outNode : this.out) {
        outNode.parentsFission();
    }
}