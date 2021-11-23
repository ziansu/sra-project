@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.add_note :
            emptyNotesFragment();
            return true;
        case R.id.save_note :
            saveNote(note);
            if (isLargeScreen())
                refreshTabletListFragment();
            
            return true;
        case R.id.delete_note :
            deleteNoteDialog().show();
            return true;
    }
    return super.onOptionsItemSelected(item);
}