public void addNote(android.view.View view) {
    com.example.max.myapplication.Note note = new com.example.max.myapplication.Note(title.getText().toString(), mainText.getText().toString());
    note.setNoteID(id);
    if ((id) == null) {
        com.example.max.myapplication.MemCacheDataStorage.getInstance().addNote(note);
    }else {
        com.example.max.myapplication.MemCacheDataStorage.getInstance().editNote(note);
    }
    finish();
}