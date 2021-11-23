public org.neo4j.graphdb.Label createLabel(java.lang.String label) {
    org.neo4j.graphdb.Label l = null;
    try (org.neo4j.graphdb.Transaction tx = uk.ac.ebi.neo4jUtils.Neo4jAccessUtils.db.beginTx()) {
        l = org.neo4j.graphdb.DynamicLabel.label("Annotation");
        tx.close();
    }
    return l;
}