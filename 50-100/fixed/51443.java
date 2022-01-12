private void commitTransaction(org.neo4j.graphdb.Transaction transaction) {
    boolean success = false;
    if (transaction != null) {
        try {
            transaction.success();
            success = true;
        } catch (java.lang.Exception e) {
            spade.storage.Neo4j.logger.log(java.util.logging.Level.SEVERE, null, e);
        } finally {
            transaction.close();
        }
    }
    commitCache(success);
    transactionCount = 0;
}