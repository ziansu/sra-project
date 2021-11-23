@java.lang.Override
public boolean evaluate(org.gephi.graph.api.Graph graph, org.gephi.graph.api.Edge edge) {
    java.lang.Object srcValue = partition.getValue(edge.getSource(), graph);
    java.lang.Object destValue = partition.getValue(edge.getTarget(), graph);
    srcValue = (srcValue == null) ? NULL : srcValue;
    destValue = (destValue == null) ? NULL : destValue;
    return ((parts.contains(srcValue)) && (parts.contains(destValue))) && (srcValue.equals(destValue));
}