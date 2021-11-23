private static int getIndex(edu.cmu.tetrad.graph.Endpoint endpoint) {
    if (endpoint == (Endpoint.CIRCLE))
        return 0;
    
    if (endpoint == (Endpoint.ARROW))
        return 1;
    
    if (endpoint == (Endpoint.TAIL))
        return 2;
    
    if (endpoint == null)
        return 3;
    
    throw new java.lang.IllegalArgumentException();
}