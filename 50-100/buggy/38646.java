public boolean checkRelationShipToken(java.lang.String token, long id) {
    org.neo4j.cypher.javacompat.ExecutionEngine engine = new org.neo4j.cypher.javacompat.ExecutionEngine(qa.datahelper.UserHelper.db);
    org.neo4j.cypher.javacompat.ExecutionResult result;
    try (org.neo4j.graphdb.Transaction tx = qa.datahelper.UserHelper.db.beginTx()) {
        java.lang.String query = ((("MATCH (a:User) -[type:Indexed]-> (b:Index) where a.ID=" + id) + " and b.token='") + token) + "' return type";
        result = engine.execute(query);
        tx.success();
        if (result == null) {
            return false;
        }else {
            return true;
        }
    }
}