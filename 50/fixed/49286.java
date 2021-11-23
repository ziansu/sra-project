@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    mAdapter = new com.mynotes.android.mynotes.NotesAdapter(this, query, this);
    mRecyclerView.setAdapter(mAdapter);
    return false;
}