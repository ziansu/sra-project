public boolean isExistByIndex(java.lang.String token) {
    java.lang.System.out.println("-------isExistByIndex---------");
    boolean result = false;
    try (org.neo4j.graphdb.Transaction tx = qa.datahelper.UserHelper.db.beginTx()) {
        org.neo4j.graphdb.ResourceIterator<org.neo4j.graphdb.Node> iterator1 = qa.datahelper.UserHelper.db.findNodesByLabelAndProperty(Index, "token", token).iterator();
        while (iterator1.hasNext()) {
            result = true;
        } 
        tx.success();
    }
    java.lang.System.out.println();
    return result;
}