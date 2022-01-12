@java.lang.Override
public long countLinks(java.lang.String dbid, long id1, long link_type) throws java.lang.Exception {
    long count = 0;
    try (edu.berkeley.cs.Transaction tx = session.beginTransaction()) {
        java.lang.String countLinksStmt = "MATCH (n1 {id: {id1}}) -[r:{link_type}]-> (n2) RETURN count(r)";
        edu.berkeley.cs.StatementResult result = session.run(countLinksStmt, edu.berkeley.cs.LinkStoreNeo4j.linkListParams(id1, link_type));
        if (result.hasNext()) {
            edu.berkeley.cs.Record record = result.next();
            count = record.get("count(r)").asLong();
        }
        tx.success();
    }
    return count;
}