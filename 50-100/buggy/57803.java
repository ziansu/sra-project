private void insertNote(java.lang.String noteText) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(DBOpenHelper.NOTE_TEXT, noteText);
    android.net.Uri noteUri = getContentResolver().insert(NotesProvider.CONTENT_URI, values);
    android.util.Log.d("MainActivity", ("Inserted note" + (noteUri.getLastPathSegment())));
}