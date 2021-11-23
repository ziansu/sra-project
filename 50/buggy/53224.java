@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.d(com.example.notepad.NoteList.TAG, "onPause");
    if ((mSelectAll) != null) {
        changeDeleteMode(false);
    }
    mToolbar.setNavigationIcon(R.drawable.ic_event_note_white_3x);
}