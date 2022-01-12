private static boolean isRelated(org.neo4j.graphdb.Node from, org.neo4j.graphdb.Node to) {
    java.lang.Iterable<org.neo4j.graphdb.Relationship> rels = from.getRelationships();
    for (org.neo4j.graphdb.Relationship rel : rels)
        if ((rel.getOtherNode(from).getId()) == (to.getId()))
            return true;
        
    
    return false;
}