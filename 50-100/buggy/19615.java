@java.lang.Override
public void onBackPressed() {
    mzhr.librenote.models.NoteStorage noteStorage = new mzhr.librenote.models.NoteStorage();
    android.widget.EditText noteText = ((android.widget.EditText) (findViewById(R.id.editText)));
    java.lang.String noteValue = noteText.getText().toString();
    try {
        noteStorage.createTextNote(getApplicationContext(), noteValue, "librenote.txt");
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    super.onBackPressed();
}