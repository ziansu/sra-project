private void searchResult(int page) {
    com.example.kseniia.presenter.YooxListRow newRow = new com.example.kseniia.presenter.YooxListRow();
    for (int i = 0; ((i + ((page - 1) * 3)) < (yooxItems.size())) && (i < 3); i++) {
        newRow.yooxItems[i] = yooxItems.get((((page - 1) * 3) + i));
    }
    yooxRows.add(newRow);
    yooxListAdapter.notifyDataSetChanged();
}