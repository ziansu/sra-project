public java.util.List<cc.creativecomputing.math.CCLine3> edges() {
    if ((_myEdges) != null)
        return _myEdges;
    
    _myEdges = new java.util.ArrayList<>();
    if ((_myGraphEdges) == null)
        return _myEdges;
    
    for (cc.creativecomputing.geometry.hemesh.CCVoronoi.CCVoronoiEdge myEdge : _myGraphEdges) {
        _myEdges.add(new cc.creativecomputing.math.CCLine3(myEdge.start().clone(), myEdge.end().clone()));
    }
    return _myEdges;
}