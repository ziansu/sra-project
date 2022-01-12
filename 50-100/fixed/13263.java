@android.support.annotation.WorkerThread
public boolean updateAfterSync(java.util.HashSet<T> tHashSet) {
    java.util.LinkedHashSet<com.bano.goblin.database.ParamUpdate> paramUpdates = new java.util.LinkedHashSet<>();
    for (T t : tHashSet) {
        paramUpdates.add(new com.bano.goblin.database.ParamUpdate(com.bano.goblin.database.BaseSyncableDao.getTableName(), ((com.bano.goblin.database.BaseSyncableDao.getIdFieldName()) + " = ?"), new java.lang.String[]{ t.id }, getSyncContentValuesAfterSync(t)));
    }
    return (com.bano.goblin.database.BaseDao.bulkUpdate(paramUpdates)) >= (tHashSet.size());
}