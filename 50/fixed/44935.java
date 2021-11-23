private boolean hasLabel(org.neo4j.elasticsearch.Node node) {
    for (org.neo4j.elasticsearch.Label l : node.getLabels()) {
        if (indexLabels.contains(l.name()))
            return true;
        
    }
    return false;
}