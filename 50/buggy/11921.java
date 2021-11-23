private void reloadData() {
    mAdapter.clearData();
    loadData();
    mAdapter.notifyDataSetChanged();
    setListAdapter(mAdapter);
}