@java.lang.Override
public boolean addLink(java.lang.String dbid, com.facebook.LinkBench.Link a, boolean noinverse) throws java.lang.Exception {
    int creationCount;
    try (edu.berkeley.cs.Transaction tx = session.beginTransaction()) {
        java.lang.String createLinkStmt = "MATCH (n1 {id: {id1}}) MATCH (n2: {id: {id2}}) " + "CREATE (n1)-[r:{link_type} {time: {time}, data: {data}}]->(n2)";
        edu.berkeley.cs.StatementResult result = tx.run(createLinkStmt, edu.berkeley.cs.LinkStoreNeo4j.linkParams(a));
        creationCount = result.consume().counters().relationshipsCreated();
        tx.success();
    }
    return creationCount > 0;
}