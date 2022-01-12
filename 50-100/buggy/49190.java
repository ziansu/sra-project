public int update(long id, io.keepcoding.rgs.everpobre.model.Notebook notebook) {
    if (notebook == null) {
        throw new java.lang.IllegalArgumentException("Passing NULL NOTEBOOK, imbecile");
    }
    if (id < 1) {
        throw new java.lang.IllegalStateException("Passing id imbecile");
    }
    int numberOfRowsUpdated = db.getWritableDatabase().update(DBConstants.TABLE_NOTEBOOK, this.getContentValues(notebook), ((io.keepcoding.rgs.everpobre.model.db.DBConstants.KEY_NOTEBOOK_ID) + "=?"), new java.lang.String[]{ "" + id });
    db.close();
    db = null;
    return numberOfRowsUpdated;
}