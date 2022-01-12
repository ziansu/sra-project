private void updateNote() {
    java.lang.String updatedNoteLabel = extractTag(noteContent.getText().toString());
    firebaseRef.setValue(new productivity.notes.rivisto.Note(noteTitle.getText().toString(), noteContent.getText().toString(), updatedNoteLabel, getCurrentTime()));
    if (!(updatedNoteLabel.equals(selectedNoteLabel))) {
        adjustTagNoteCount(selectedNoteLabel, updatedNoteLabel);
        selectedNoteLabel = updatedNoteLabel;
    }
}