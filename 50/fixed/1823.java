public void addNode(de.verispl.core.controlflow.INode node) {
    if (node != null) {
        nodes.add(node);
        if ((start) == null)
            start = node;
        
    }
}