private java.util.PriorityQueue<de.fau.cs.mad.kwikshop.server.sorting.Edge> getSortedEdges() {
    java.util.PriorityQueue<de.fau.cs.mad.kwikshop.server.sorting.Edge> edges = new java.util.PriorityQueue(new java.util.Comparator<de.fau.cs.mad.kwikshop.server.sorting.Edge>() {
        @java.lang.Override
        public int compare(de.fau.cs.mad.kwikshop.server.sorting.Edge e1, de.fau.cs.mad.kwikshop.server.sorting.Edge e2) {
            return (e2.getWeight()) - (e1.getWeight());
        }
    });
    edges.addAll(this.edges);
    return edges;
}