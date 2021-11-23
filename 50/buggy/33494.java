private boolean hasLabel(org.neo4j.graphdb.event.LabelEntry labelEntry) {
    return indexLabels.contains(labelEntry.label());
}