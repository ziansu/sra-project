private boolean relativeWidth(graph.SequenceNode node) {
    if ((node.isSNP()) && (node.isCollapsed())) {
        return false;
    }
    if (!(node.getChildren().isEmpty())) {
        graph.SequenceNode child = graph.getNode(node.getChild(0));
        if ((child.isSNP()) && (child.isCollapsed())) {
            return false;
        }
    }
    return true;
}