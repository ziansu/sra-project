private void commitTransaction(org.neo4j.graphdb.Transaction transaction) {
    boolean success = false;
    try {
        transaction.success();
        transaction.close();
        success = true;
    } catch (java.lang.Exception e) {
        spade.storage.Neo4j.logger.log(java.util.logging.Level.SEVERE, null, e);
    }
    commitCache(success);
    transactionCount = 0;
}