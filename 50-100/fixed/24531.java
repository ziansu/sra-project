public static boolean hasRelationship(final nhs.genetics.cardiff.GraphDatabaseService graphDb, nhs.genetics.cardiff.Node node1, nhs.genetics.cardiff.Node node2, nhs.genetics.cardiff.RelationshipType type, nhs.genetics.cardiff.Direction direction) {
    try (nhs.genetics.cardiff.Transaction tx = graphDb.beginTx()) {
        for (nhs.genetics.cardiff.Relationship relationship : node1.getRelationships(type, direction)) {
            if ((relationship.getOtherNode(node1).getId()) == (node2.getId())) {
                return true;
            }
        }
    }
    return false;
}