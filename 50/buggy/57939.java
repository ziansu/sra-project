public java.lang.String getNoteIDs(java.util.UUID id) {
    return getString(getColumnIndex(NoteSchema.NoteTable.Cols.NOTE_ID));
}