public void addItem(com.crux.ListItem item, int position) {
    if (com.crux.util.CollectionUtils.isEmpty(mItems)) {
        mItems = new java.util.ArrayList<>();
    }
    mItems.add(position, item);
    initializeItemsWithType();
}