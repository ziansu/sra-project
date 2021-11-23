public java.util.List<com.mememachine.mike.laboratorynotehelper.Note> getNotes() {
    java.util.List<com.mememachine.mike.laboratorynotehelper.Note> notes = new java.util.ArrayList<>();
    com.mememachine.mike.laboratorynotehelper.database.DatabaseCursorWrapper cursorWrapper = queryDatabases(null, null, null, NoteSchema.NoteTable.TABLE_NOTES);
    try {
        cursorWrapper.moveToFirst();
        while (!(cursorWrapper.isAfterLast())) {
            notes.add(cursorWrapper.getNote());
            cursorWrapper.moveToNext();
        } 
    } finally {
        cursorWrapper.close();
    }
    return notes;
}