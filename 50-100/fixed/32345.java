public com.mememachine.mike.laboratorynotehelper.Notebook getNotebook(java.util.UUID id) {
    com.mememachine.mike.laboratorynotehelper.database.DatabaseCursorWrapper cursorWrapper = queryDatabases(null, ((NoteSchema.NoteTable.Cols.UUID) + " = ?"), new java.lang.String[]{ id.toString() }, NoteSchema.NoteTable.TABLE_NOTEBOOKS);
    try {
        if ((cursorWrapper.getCount()) == 0) {
            return null;
        }
        cursorWrapper.moveToFirst();
        return cursorWrapper.getNotebook();
    } finally {
        cursorWrapper.close();
    }
}