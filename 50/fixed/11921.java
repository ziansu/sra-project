public void reloadData() {
    mAdapter.clearData();
    loadData();
    mAdapter.notifyDataSetChanged();
    setListAdapter(mAdapter);
}