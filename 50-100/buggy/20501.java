public com.mongodb.client.result.UpdateResult updateUser(final java.lang.String id, final java.lang.String indexName, final java.lang.String indexValue) throws java.lang.Exception {
    final org.openape.server.database.mongoDB.DatabaseConnection databaseConnection = org.openape.server.database.mongoDB.DatabaseConnection.getInstance();
    com.mongodb.client.result.UpdateResult updateResult = null;
    updateResult = databaseConnection.updateDocument(org.openape.ui.velocity.requestHandler.AdminSectionRequestHandler.COLLECTIONTOUSE_USERS, id, indexName, indexValue);
    return updateResult;
}