private org.neo4j.graphdb.Relationship searchForHAVE(final org.animotron.manipulator.PFlow pf, final org.neo4j.graphdb.Relationship ref, final java.util.Set<org.neo4j.graphdb.Node> thes) {
    boolean checkStart = true;
    org.neo4j.graphdb.Relationship have = null;
    if (checkStart) {
        have = getByHave(pf, null, ref.getStartNode(), thes);
        if (have != null)
            return have;
        
    }
    return searchForHAVE(pf, ref, ref.getEndNode(), thes);
}