@java.lang.Override
public boolean deleteLink(java.lang.String dbid, long id1, long link_type, long id2, boolean noinverse, boolean expunge) throws java.lang.Exception {
    int deletionCount;
    try (edu.berkeley.cs.Transaction tx = session.beginTransaction()) {
        java.lang.String deleteLinkStmt = "MATCH (n1 {id: {id1}}) -[r:{link_type}]-> (n2: {id: {id2}}) DELETE r";
        edu.berkeley.cs.StatementResult result = session.run(deleteLinkStmt, edu.berkeley.cs.LinkStoreNeo4j.linkParams(id1, link_type, id2));
        deletionCount = result.consume().counters().relationshipsDeleted();
        tx.success();
    }
    return deletionCount > 0;
}