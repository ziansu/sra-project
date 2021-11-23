private static void copyRelationship(org.neo4j.graphdb.Node from, org.neo4j.graphdb.Node to, org.neo4j.graphdb.RelationshipType type) {
    if (!(org.rdswitchboard.utils.neo4j.sync.App.isRelated(from, to))) {
        java.lang.System.out.println("Creting new relationship");
        from.createRelationshipTo(to, type);
        ++(org.rdswitchboard.utils.neo4j.sync.App.relCounter);
        ++(org.rdswitchboard.utils.neo4j.sync.App.chunkSize);
    }
}