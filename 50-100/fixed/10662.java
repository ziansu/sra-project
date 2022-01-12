public V getOther(E e, V oneEnd) {
    if (!(edges.containsKey(e)))
        throw new graph.Graph.NotInGraphException("Can't find other endpoint of edge", e);
    
    graph.Graph<V, E>.Edge edge = edges.get(e);
    if (edge._1.v.equals(oneEnd))
        return edge._3.v;
    
    if (edge._3.v.equals(oneEnd))
        return edge._1.v;
    
    return null;
}