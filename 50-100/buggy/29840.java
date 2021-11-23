public static void walk(joshua.decoder.hypergraph.HGNode node, joshua.decoder.hypergraph.WalkerFunction walker) {
    walker.apply(node);
    for (joshua.decoder.hypergraph.HyperEdge edge : node.getHyperEdges()) {
        for (joshua.decoder.hypergraph.HGNode tailNode : edge.getAntNodes()) {
            joshua.decoder.hypergraph.ForestWalker.walk(tailNode, walker);
        }
    }
}