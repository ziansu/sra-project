private void selectPos(int pos) {
    if ((checkMode) == (com.nononsenseapps.notepad.NotesListFragment.CHECK_SINGLE_FUTURE)) {
        setSingleCheck(pos);
    }
    android.util.Log.d(com.nononsenseapps.notepad.NotesListFragment.TAG, ("selectPos: " + pos));
    getListView().setItemChecked(pos, true);
}