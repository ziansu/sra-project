public void addItems(int position, java.util.List<com.crux.ListItem> items) {
    if ((mItems) == null) {
        mItems = new java.util.ArrayList<>();
    }
    mItems.addAll(position, items);
    initializeItemsWithType();
}