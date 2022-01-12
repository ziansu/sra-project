@java.lang.Override
public boolean evaluate(java.lang.Object vertex) {
    if (vertexTypeFilter(vertex)) {
        return false;
    }
    if (vertexLonelyFilter(vertex)) {
        return false;
    }
    if (vertexLabelFilter(vertex)) {
        return false;
    }
    return !(vertexTemporalFilter(vertex));
}