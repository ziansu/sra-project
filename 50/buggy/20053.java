private void populateListView() {
    if (!(isIdentical(lstItemsModel, adapter.getData()))) {
        adapter.setData(lstItemsModel);
        showEmptyIfEmpty();
        adapter.notifyDataSetChanged();
    }
}