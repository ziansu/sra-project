public boolean delete(com.mozzandroidutils.sqlite.Model t) {
    if (((t.hasSetId()) && (mTableExist)) && (!(mReadOnly))) {
        java.lang.String deleteSQL = (((("DELETE FROM table " + (mTableName)) + " WHERE ") + (com.mozzandroidutils.sqlite.Eloquent.ID_COLUMN)) + " = ") + (t.id());
        synchronized(mDatabase) {
            mDatabase.execSQL(deleteSQL);
        }
        return true;
    }
    return false;
}