@java.lang.Override
public final boolean remove(T item) {
    int position = getPosition(item);
    if (itemList.remove(item)) {
        removedItemList.add(item);
        de.aw.awlib.adapters.AWItemListAdapter.notifyItemRemoved(position);
        return true;
    }
    return false;
}