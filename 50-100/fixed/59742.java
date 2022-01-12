private int[] sortOrdersIntoReorderedIndices(int childCount, java.util.List<com.google.android.flexbox.FlexboxLayout.Order> orders) {
    java.util.Collections.sort(orders);
    if ((mOrderCache) == null) {
        mOrderCache = new android.util.SparseIntArray(childCount);
    }
    mOrderCache.clear();
    int[] reorderedIndices = new int[childCount];
    int i = 0;
    for (com.google.android.flexbox.FlexboxLayout.Order order : orders) {
        reorderedIndices[i] = order.index;
        mOrderCache.append(order.index, order.order);
        i++;
    }
    return reorderedIndices;
}