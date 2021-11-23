protected void deleteFromGraph() {
    for (org.threadly.load.gui.Node n : parentNodes) {
        n.childNodes.remove(this);
    }
}