private void insertNote(java.lang.String noteText) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(DBOpenHelper.NOTE_TEXT, noteText);
    getContentResolver().insert(NotesProvider.CONTENT_URI, values);
    setResult(com.nguyenqphan.notes4u.RESULT_OK);
}