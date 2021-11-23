void sequenceSet(long tableID, java.lang.String key, long number) throws com.scalien.scaliendb.SDBPException {
    sequenceSet(tableID, com.scalien.scaliendb.Client.stringToByteArray(key), number);
}