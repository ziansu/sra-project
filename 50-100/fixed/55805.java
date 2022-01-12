private void BindDataToListView() {
    if (onRefresh) {
        onRefresh = false;
    }
    if ((fansListAdapter) == null) {
        fansListAdapter = new com.app.tomore.adapters.FansAdapter();
        mListView.setAdapter(fansListAdapter);
    }else {
        fansListAdapter.notifyDataSetChanged();
    }
    if (((fansList) != null) && ((fansList.size()) > 0)) {
    }else {
    }
}