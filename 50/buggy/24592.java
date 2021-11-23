private de.aw.awlib.adapters.AWBaseRecyclerViewAdapter getCustomAdapter() {
    if ((mAdapter) == null) {
        mAdapter = getBaseAdapter();
    }
    configure(mAdapter);
    mAdapter.setTouchHelper(callbackTouchHelper);
    return mAdapter;
}