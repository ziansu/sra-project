public void deleteElements(java.lang.Integer numberElements) {
    for (int i = 1; i <= numberElements; i++) {
        itemList.remove(maxItems);
        (maxItems)--;
    }
    dataAdapter.notifyDataSetChanged();
    maxPages.setText(maxItems.toString());
}