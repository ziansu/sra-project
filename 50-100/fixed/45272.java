@java.lang.Override
public void setStartNode(int node) throws java.lang.IllegalArgumentException {
    if (((this.graph) == null) || ((this.graph.getLength()) <= node)) {
        throw new java.lang.IllegalArgumentException("Dieser Punkt existiert nicht");
    }
    if ((this.startNode) != node) {
        this.startNode = node;
        this.startNodeChanged = true;
    }
}