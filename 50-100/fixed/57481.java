public void deleteElements(java.lang.Integer numberElements) {
    for (int i = 1; i <= numberElements; i++) {
        itemList.remove(maxItems);
        (maxItems)--;
    }
    for (int i = 0; i <= ((maxItems) + 1); i++) {
        itemList.set(i, i);
    }
    dataAdapter.notifyDataSetChanged();
    maxPages.setText(maxItems.toString());
}