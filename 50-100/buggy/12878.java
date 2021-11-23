public void setMaxCount(java.lang.Integer max) {
    for (int i = 0; i <= (max + 1); i++) {
        itemList.add(i);
    }
    maxItems = max;
    currentPageListView.setEnabled(false);
    dataAdapter.setPagesNumber(itemList);
    currentPageListView.setAdapter(dataAdapter);
    maxPages.setText(max.toString());
}