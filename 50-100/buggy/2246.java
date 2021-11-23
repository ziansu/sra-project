private void initializeNodes(main.java.datatype.Node from) {
    for (main.java.datatype.Node node : nodes) {
        if (node.equals(from)) {
            node.setTime(java.lang.Double.MAX_VALUE);
        }else {
            node.setTime(0.0);
        }
        queue.addNode(node);
    }
}