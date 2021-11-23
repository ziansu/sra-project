public void saveNote() {
    if ((currentNote) == null) {
        currentNote = net.sf.memoranda.CurrentProject.getNoteList().createNoteForDate(currentDate);
        currentNote.setTitle(editorPanel.titleField.getText());
        currentNote.setId(net.sf.memoranda.util.Util.generateId());
        currentNote.setTags(editorPanel.tagField.getText());
        currentNote.setPriority(editorPanel.priorityCB.getSelectedIndex());
        net.sf.memoranda.util.CurrentStorage.get().storeNote(currentNote, editorPanel.getDocument());
    }
}