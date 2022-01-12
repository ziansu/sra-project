@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (((requestCode == (com.example.gevorg.easynote.activity.MainActivity.REQUEST_CODE)) && (resultCode == (RESULT_OK))) && (data != null)) {
        com.example.gevorg.easynote.model.Note note = ((com.example.gevorg.easynote.model.Note) (data.getSerializableExtra("note")));
        mNoteAdapter.addNote(note);
        mNoteAdapter.notifyDataSetChanged();
    }
}