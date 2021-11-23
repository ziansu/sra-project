public void notifyAdapterSubItemsChanged(int position) {
    if (mPositionBasedStateManagement) {
        if ((mExpanded.indexOfKey(position)) > (-1)) {
            int previousCount = mExpanded.get(position);
            int itemsCount = notifyAdapterSubItemsChanged(position, previousCount);
            if (itemsCount == 0) {
                mExpanded.delete(position);
            }else {
                mExpanded.put(position, itemsCount);
            }
        }
    }else {
        android.util.Log.e("FastAdapter", "please use the notifyAdapterSubItemsChanged(int position, int previousCount) method instead in the PositionBasedStateManagement mode, as we are not able to calculate the previous count ");
    }
}