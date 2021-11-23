@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public <T> com.questdb.JournalBulkReader<T> bulkReader(com.questdb.JournalKey<T> key) throws com.questdb.ex.JournalException {
    java.lang.String name = key.path();
    checkBlocked(name);
    com.questdb.JournalBulkReader<T> result = bulkReaders.get(name);
    if (result == null) {
        result = super.bulkReader(key);
        result.setCloseListener(this);
        bulkReaders.put(name, result);
        journalList.add(result);
    }
    return result;
}