public void openClickedItem(int position) {
    myGridLayoutManager.openItem(position);
    adapter.setItemsExpanded(true);
    databaseAccess.startUpdateExpandedColumnTask(adapter.isItemsExpanded());
}