@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String note = java.lang.String.valueOf(taskEditText.getText());
    android.database.sqlite.SQLiteDatabase db = mHelper.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(NoteContract.NoteEntry.COL_NOTE_TITLE, note);
    db.insertWithOnConflict(NoteContract.NoteEntry.TABLE, null, values, SQLiteDatabase.CONFLICT_REPLACE);
    db.close();
    updateUI();
}