public boolean evaluate(org.gephi.graph.api.Graph graph, org.gephi.graph.api.Edge edge) {
    java.lang.Object value = partition.getValue(edge);
    if (value == null) {
        return parts.contains(org.gephi.filters.plugin.partition.PartitionBuilder.PartitionFilter.NULL);
    }else {
        return parts.contains(value);
    }
}