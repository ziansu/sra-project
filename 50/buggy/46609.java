@java.lang.Override
protected void onResume() {
    android.widget.Toast.makeText(this, "resume", Toast.LENGTH_SHORT).show();
    mAdapter.swapCursor(com.mynotes.android.mynotes.data.DataUtils.getInstance(this).getAllNotes("date"));
    setAdapter();
    super.onResume();
}