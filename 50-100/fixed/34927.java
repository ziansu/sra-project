@java.lang.Override
public boolean createSecondaryKey(com.sleepycat.db.SecondaryDatabase arg0, com.sleepycat.db.DatabaseEntry dbKey, com.sleepycat.db.DatabaseEntry dbData, com.sleepycat.db.DatabaseEntry dbResult) throws com.sleepycat.db.DatabaseException {
    java.lang.String data = getString(dbData);
    java.lang.String secondaryKey = data.substring(0, 1);
    dbResult.setData(secondaryKey.getBytes());
    dbResult.setSize(secondaryKey.length());
    return true;
}