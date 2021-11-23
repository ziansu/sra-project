public void addEdge(java.lang.String edgeName, gate.Annotation from, gate.Annotation to) {
    ensureActive();
    java.util.List<java.lang.Integer> ids = getToEdgesList(edgeName, from);
    ids.add(to.getId());
    ids = getFromEdgesList(edgeName, to);
    ids.add(from.getId());
}