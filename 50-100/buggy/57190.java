@java.lang.Override
public java.util.Set<com.buschmais.xo.neo4j.api.model.Neo4jLabel> getEntityDiscriminators(com.buschmais.xo.neo4j.api.model.Neo4jNode node) {
    java.util.Set<com.buschmais.xo.neo4j.api.model.Neo4jLabel> labels = labelCache.getIfPresent(node.getId());
    if (labels == null) {
        labels = new it.unimi.dsi.fastutil.objects.ObjectOpenHashSet();
        for (org.neo4j.graphdb.Label label : node.getLabels()) {
            labels.add(new com.buschmais.xo.neo4j.api.model.Neo4jLabel(label));
        }
        labelCache.put(node.getId(), labels);
    }
    return labels;
}