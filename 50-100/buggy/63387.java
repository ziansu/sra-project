@java.lang.Override
public void edgeInserted(V source, V target) {
    java.util.Map<V, java.lang.Integer> incoming = incomingEdges.get(target);
    if (incoming == null) {
        incoming = new java.util.HashMap<V, java.lang.Integer>();
        incomingEdges.put(target, incoming);
    }
    java.lang.Integer count = incoming.get(incoming);
    if (count == null) {
        count = 0;
    }
    count++;
    incoming.put(source, count);
}