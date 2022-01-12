void currentNoteChanged(net.sf.memoranda.Note note, boolean toSaveCurrentNote) {
    if (editorPanel.isDocumentChanged()) {
        if (toSaveCurrentNote) {
            saveNote();
        }
        notesControlPane.refresh();
    }
    if (note != null)
        currentNote = note;
    
    editorPanel.setDocument(currentNote);
    calendar.set(net.sf.memoranda.date.CurrentDate.get());
    editorPanel.editor.requestFocus();
}