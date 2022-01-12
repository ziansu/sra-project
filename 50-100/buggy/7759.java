@java.lang.Override
public <T> T addFramedEdgeExplicit(final com.syncleus.ferma.VertexFrame source, final com.syncleus.ferma.VertexFrame destination, final java.lang.String label, final com.syncleus.ferma.ClassInitializer<T> initializer) {
    final T framedEdge = frameNewElementExplicit(source.getElement().addEdge(label, destination.getElement(), null), initializer);
    return framedEdge;
}