void unregister(org.graphstream.graph.Edge e) {
    if (e.isDirected()) {
        if (e.getSourceNode().getId().equals(getId()))
            (oDegree)--;
        else
            (iDegree)--;
        
    }else {
        (oDegree)--;
        (iDegree)--;
    }
    (ioDegree)--;
}