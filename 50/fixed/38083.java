public void closeDB() {
    if (((mSQLiteDatabase) != null) && (mSQLiteDatabase.isOpen())) {
        mSQLiteDatabase.close();
    }
}