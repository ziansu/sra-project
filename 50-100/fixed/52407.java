private void initializeData() {
    java.lang.String title = getIntent().getStringExtra("note_title");
    java.lang.String content = getIntent().getStringExtra("note_content");
    saveNote(title, content);
    if ((!(title == null)) && (!(content == null))) {
        notes.add(new com.hfad.note.Note(title, content));
    }
}