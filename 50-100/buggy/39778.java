@java.lang.Override
public void onActionClicked(com.myrippleapps.mynotes.app.fragment.Snackbar snackbar) {
    com.myrippleapps.mynotes.app.database.NoteRecord noteRecord = ((com.myrippleapps.mynotes.app.database.NoteRecord) (intent.getSerializableExtra("records")));
    dataSource.open();
    dataSource.archivedNote(noteRecord.getNote_id());
    adapterNote.add(n6, noteRecord);
    layoutManager.scrollToPosition(n6);
    isNoteEmpty();
}