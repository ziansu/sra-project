public void add(@android.support.annotation.NonNull
com.vangroan.botexperiment.graph.nodes.BotNode node) {
    if (!(node.hasId()))
        throw new com.vangroan.botexperiment.graph.exceptions.BotNodeIdMissing("Attempt to add Node to graph with no ID set");
    
    if (indexes.containsKey(node.getId()))
        throw new com.vangroan.botexperiment.graph.exceptions.BotNodeIdExists(("Node with name already exists in graph: " + (node.hasId())));
    
    nodes.add(node);
    indexes.put(node.getId(), ((nodes.size()) - 1));
}