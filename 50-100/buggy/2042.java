@java.lang.Override
public boolean acquireLock() {
    final org.bson.Document lockDocument = new com.rinoto.migramongo.dao.MongoLockService.LockEntryDocBuilder().lock().build();
    final org.bson.Document result = getLockCollection().findOneAndUpdate(new org.bson.Document(com.rinoto.migramongo.dao.MongoLockService.LockEntryDocBuilder.LOCK_ENTRY, true), new org.bson.Document("$set", lockDocument));
    return (result != null) && ((result.getBoolean(com.rinoto.migramongo.dao.MongoLockService.LockEntryDocBuilder.LOCKED, true)) == false);
}