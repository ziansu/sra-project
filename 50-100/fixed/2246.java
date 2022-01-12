private void initializeNodes(main.java.datatype.Node from) {
    for (main.java.datatype.Node node : nodes) {
        if (node.equals(from)) {
            node.setTime(0.0);
        }else {
            node.setTime(java.lang.Double.MAX_VALUE);
        }
        queue.addNode(node);
    }
}