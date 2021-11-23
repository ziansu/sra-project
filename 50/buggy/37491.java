@java.lang.Override
public void onItemClicked(java.lang.String data) {
    if (selected(data)) {
        mAdapter.notifyDataSetChanged();
    }
}