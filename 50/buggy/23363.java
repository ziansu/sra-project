public boolean deleteRow(long rowId) {
    (rory.bain.counter.app.libraryDBAdapter.size)--;
    java.lang.String where = ((rory.bain.counter.app.libraryDBAdapter.KEY_ROWID) + "=") + rowId;
    return (db.delete(rory.bain.counter.app.libraryDBAdapter.DATABASE_TABLE, where, null)) != 0;
}