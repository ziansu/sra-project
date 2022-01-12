public void onAddItem(android.view.View v) {
    com.codepath.simpletodoapp.activities.EditEntryDialogFragment newEntryFrag = com.codepath.simpletodoapp.activities.EditEntryDialogFragment.newInstance(null, null, "MEDIUM", NEW_WRITE);
    newEntryFrag.show(getSupportFragmentManager(), "fragment_edit_entries");
}