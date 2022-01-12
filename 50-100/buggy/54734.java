public void onClick(android.content.DialogInterface dialog, int whichButton) {
    com.example.su.notes.MainActivity.noteText = edittext.getText().toString().trim();
    insertNote();
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    android.widget.Toast.makeText(getApplicationContext(), "Note Saved!", Toast.LENGTH_SHORT).show();
}