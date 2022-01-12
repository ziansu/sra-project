public void setListAdapter(android.widget.ListAdapter adapter) {
    synchronized(this) {
        mAdapter = adapter;
        mList.setAdapter(mAdapter);
    }
}