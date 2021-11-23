public java.util.Map<java.lang.Integer, java.lang.Double> getEdgeWeights() {
    java.util.HashMap<java.lang.Integer, java.lang.Double> edgeWeights = new java.util.HashMap<>();
    for (dat.POGraph.Edge next : current.getNextTransitions())
        if ((next.getNext()) != (finalNode))
            edgeWeights.put(next.getNext().getID(), ((1.0 * (next.getSequences().size())) / (sequences.size())));
        
    
    return edgeWeights;
}