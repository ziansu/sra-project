@java.lang.Override
public void onClick(android.view.View v) {
    for (int i = 0; i < (selectedItems.size()); i++) {
        mAdapter.addItem(selectedItems.get(i), selectedEntries.get(i));
        mAdapter.toggleSelection(selectedItems.get(i));
    }
    mRecyclerView.scrollToPosition(selectedItems.get(0));
    db.deleteWifiEntries(selectedEntries, true);
}