@java.lang.Override
public java.lang.Double getRank(V origin, V target) {
    if (!(g.containsVertex(origin)))
        throw new java.lang.IllegalArgumentException("Origin vertex isn't part of the graph.");
    
    if (!(g.containsVertex(target)))
        throw new java.lang.IllegalArgumentException("Target vertex isn't part of the graph.");
    
    return (scores.get(origin).get(target)) != null ? scores.get(origin).get(target) : 0.0;
}