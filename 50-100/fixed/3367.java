public boolean checkRelationShipUser(long user, long follower) {
    org.neo4j.cypher.javacompat.ExecutionEngine engine = new org.neo4j.cypher.javacompat.ExecutionEngine(qa.datahelper.UserHelper.db);
    org.neo4j.cypher.javacompat.ExecutionResult result;
    try (org.neo4j.graphdb.Transaction tx = qa.datahelper.UserHelper.db.beginTx()) {
        java.lang.String query = ((("MATCH (user:User) <-[type:Followed]- (follower:User) where user.ID=" + user) + " and follower.ID=") + follower) + " return type";
        result = engine.execute(query);
        tx.success();
    }
    if (result == null) {
        return false;
    }else {
        return true;
    }
}