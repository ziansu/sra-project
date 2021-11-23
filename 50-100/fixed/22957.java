public static com.etesync.syncadapter.model.JournalEntity fetch(io.requery.sql.EntityDataStore<io.requery.Persistable> data, java.lang.String url) {
    com.etesync.syncadapter.model.JournalEntity ret = data.select(com.etesync.syncadapter.model.JournalEntity.class).where(JournalEntity.UID.eq(url)).limit(1).get().firstOrNull();
    return ret;
}