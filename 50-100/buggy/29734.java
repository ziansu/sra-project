private void rankDest(org.neo4j.graphdb.Node n) {
    int rankSource = ((int) (n.getProperty(nl.tudelft.dnainator.graph.impl.PropertyTypes.RANK.name())));
    for (org.neo4j.graphdb.Relationship r : n.getRelationships(RelTypes.NEXT, Direction.OUTGOING)) {
        org.neo4j.graphdb.Node dest = r.getEndNode();
        if (((int) (dest.getProperty(nl.tudelft.dnainator.graph.impl.PropertyTypes.RANK.name()))) < (rankSource + 1)) {
            dest.setProperty(nl.tudelft.dnainator.graph.impl.PropertyTypes.RANK.name(), (rankSource + 1));
        }
    }
}