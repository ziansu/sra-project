private void search(java.lang.String query) {
    final java.util.List<pro.rgun.banktestapp.screen.main.ListItemBankModel> list;
    if (query.isEmpty()) {
        list = listItemBankModels;
    }else {
        list = filter(listItemBankModels, query);
    }
    mAdapter.clear();
    addDataToRecyclerView(list);
    vh.recyclerView.scrollToPosition(0);
}