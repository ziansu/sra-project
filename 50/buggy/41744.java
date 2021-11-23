@java.lang.Override
public void execute(org.neo4j.graphdb.GraphDatabaseService service) {
    try (org.neo4j.graphdb.Transaction tx = service.beginTx()) {
        for (org.neo4j.graphdb.Node n : topologicalOrder(service)) {
            rankDest(n);
        }
        tx.success();
    }
}