public long insert(io.keepcoding.rgs.everpobre.model.Notebook notebook) {
    if (notebook == null) {
        throw new java.lang.IllegalArgumentException("Passing NULL NOTEBOOK, imbecile");
    }
    long id = db.getWritableDatabase().insert(DBConstants.TABLE_NOTEBOOK, null, this.getContentValues(notebook));
    notebook.setId(id);
    db.close();
    return id;
}