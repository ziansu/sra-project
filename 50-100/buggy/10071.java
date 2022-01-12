public void removePerson(int id) {
    mDBOpenHelper = new cbpos1989.com.sqlitedatabase.DBOpenHelper(mContext);
    mDatabase = mDBOpenHelper.getWritableDatabase();
    mDatabase.execSQL(((((("DELETE FROM " + (DBFeederContract.PersonTable.TABLE_NAME)) + " WHERE ") + (DBFeederContract.PersonTable._ID)) + " = ") + id), null);
    mDatabase.close();
    mDBOpenHelper.close();
    mDatabase = null;
    mDBOpenHelper = null;
}