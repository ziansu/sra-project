private void delete(android.view.View view, int postion) {
    android.content.ContentResolver cr = this.getContentResolver();
    java.lang.String _ID = java.lang.Integer.parseInt(((android.widget.TextView) (view.findViewById(R.id.id_note_custom_home))).getText().toString());
    android.net.Uri uri = NotesContract.Notes.buildNoteUri(_ID);
    cr.delete(uri, null, null);
    mNotesAdapter.delete(postion);
    changeNoItemTag();
}