@java.lang.Override
public com.ensoftcorp.atlas.core.db.set.AtlasSet<com.ensoftcorp.atlas.core.db.graph.Node> getSuccessors(com.ensoftcorp.atlas.core.db.graph.Node node) {
    com.ensoftcorp.atlas.core.db.set.AtlasSet<com.ensoftcorp.atlas.core.db.graph.Node> successors = new com.ensoftcorp.atlas.core.db.set.AtlasHashSet<com.ensoftcorp.atlas.core.db.graph.Node>();
    for (com.ensoftcorp.atlas.core.db.graph.Edge edge : edges()) {
        if (edge.getNode(EdgeDirection.FROM).equals(node)) {
            com.ensoftcorp.atlas.core.db.graph.Node child = edge.getNode(EdgeDirection.TO);
            successors.add(child);
        }
    }
    return successors;
}