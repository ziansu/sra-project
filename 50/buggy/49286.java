@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.widget.Toast.makeText(this, query, Toast.LENGTH_SHORT).show();
    mAdapter = new com.mynotes.android.mynotes.NotesAdapter(this, query, this);
    mRecyclerView.setAdapter(mAdapter);
    return false;
}