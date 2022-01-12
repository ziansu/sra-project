protected void onEnvelopeIntersection(org.neo4j.graphdb.Node geomNode, com.vividsolutions.jts.geom.Envelope geomEnvelope) {
    com.vividsolutions.jts.geom.Geometry geometry = decode(geomNode);
    double distance = geometry.distance(other);
    if (distance < (minDistance)) {
        clearResults();
        minDistance = distance;
        add(geomNode, geometry);
    }else
        if (distance == (minDistance)) {
            add(geomNode, geometry);
        }
    
}