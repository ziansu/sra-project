private void updateNotesFromSaver() {
    sergeylysyi.notes.note.NoteSaver.Query query = saver.new sergeylysyi.notes.Query().fromFilter(filtersHolder.getCurrentFilterCopy());
    updateNotesByQuery(query);
}