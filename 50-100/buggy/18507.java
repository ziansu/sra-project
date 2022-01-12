@java.lang.Override
public boolean evaluate(org.gephi.graph.api.Graph graph, org.gephi.graph.api.Element element) {
    java.lang.Object p = partition.getValue(element);
    if (p != null) {
        int partCount = partition.count(p);
        return range.isInRange(partCount);
    }
    return false;
}