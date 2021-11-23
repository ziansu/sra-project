private void init() {
    for (node.Node n : nodes) {
        n.passInitialMessages();
    }
    java.lang.System.out.println("Initial messages passed.");
}