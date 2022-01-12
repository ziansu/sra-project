@java.lang.Override
public void linkBoth(final com.syncleus.ferma.VertexFrame vertex, final java.lang.String... labels) {
    for (final java.lang.String label : labels) {
        vertex.getElement().addEdge(label, this.getElement());
        this.getElement().addEdge(label, vertex.getElement());
    }
}