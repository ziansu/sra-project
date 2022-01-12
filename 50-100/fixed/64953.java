private void appendDate() {
    final java.util.ArrayList addItems = dbHelper.getAllItems(currentPage, com.fionera.wechatdemo.extra.PullToLoadActivity.lineSize);
    baseAdapter.setCount(((baseAdapter.getCount()) + (addItems.size())));
    if ((allRecorders) == (baseAdapter.getCount())) {
        listView.removeHeaderView(header);
    }
    items.addAll(0, addItems);
    baseAdapter.notifyDataSetChanged();
    listView.setSelection(addItems.size());
}