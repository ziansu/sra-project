public boolean delete(T t) {
    if (((t.hasSetId()) && (mTableExist)) && (!(mReadOnly))) {
        java.lang.String deleteSQL = (((("DELETE FROM table " + (mTableName)) + " WHERE ") + (com.mozzandroidutils.sqlite.Eloquent.ID_COLUMN)) + " = ") + (t._id);
        debug(deleteSQL);
        synchronized(mDatabase) {
            mDatabase.execSQL(deleteSQL);
        }
        return true;
    }
    return false;
}