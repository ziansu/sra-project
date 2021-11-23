@java.lang.Override
public final com.questdb.Journal reader(java.lang.String location) throws com.questdb.ex.JournalException {
    return reader(new com.questdb.JournalKey(location));
}