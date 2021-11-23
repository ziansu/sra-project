public void addActiveNode(java.lang.String nodeName) {
    if (nodeName != null) {
        activeNodes.add(nodeName);
        traversedNodes.remove(nodeName);
    }
}