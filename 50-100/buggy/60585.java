@java.lang.Override
public long addNode(java.lang.String dbid, com.facebook.LinkBench.Node node) throws java.lang.Exception {
    long id;
    try (edu.berkeley.cs.Transaction tx = session.beginTransaction()) {
        id = idGenerator.getAndIncrement();
        java.lang.String createNodeStmt = "CREATE (node {id: {id}, type: {type}, data: {data}})";
        session.run(createNodeStmt, edu.berkeley.cs.LinkStoreNeo4j.nodeParams(id, node.type, node.data));
        tx.success();
    }
    return id;
}