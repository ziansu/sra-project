@java.lang.Override
public void userExpired(java.lang.String chatId, int userId) {
    com.mongodb.client.result.DeleteResult result = getChatMemberCollection(chatId).deleteOne(com.mongodb.client.model.Filters.eq(com.abarruda.musicbot.persistence.MongoDbFacade.USER_ID_BSON, userId));
    if ((result.getDeletedCount()) != 1) {
        com.abarruda.musicbot.persistence.MongoDbFacade.logger.warn("Error deleting expired user!");
    }
}