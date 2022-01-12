public long deleteAccessToken(long userId) {
    android.database.sqlite.SQLiteDatabase database = getWritableDatabase();
    database.delete("AccountTokenList", "userId=?", new java.lang.String[]{ java.lang.String.valueOf(userId) });
    long count = (android.database.DatabaseUtils.queryNumEntries(database, "AccountTokenList")) - 1;
    database.close();
    return count;
}