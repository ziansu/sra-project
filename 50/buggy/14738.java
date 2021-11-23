public synchronized void add(com.box.androidsdk.content.models.BoxItem item) {
    mItems.add(item);
    mItemsPositionMap.put(item.getId(), ((mItems.size()) - 1));
}