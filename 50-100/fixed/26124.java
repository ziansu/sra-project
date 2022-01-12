@java.lang.Override
protected void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    super.onListItemClick(l, v, position, id);
    android.content.Intent i = new android.content.Intent(this, edu.gatech.androidnoteapp.NoteEditActivity.class);
    i.putExtra(NoteEditActivity.KEY_NOTEEXISTS, true);
    i.putExtra(NoteEditActivity.KEY_NOTEID, l.getAdapter().getItemId(position));
    startActivityForResult(i, edu.gatech.androidnoteapp.NoteListActivity.ACTIVITY_EDIT);
}