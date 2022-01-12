@java.lang.Override
public boolean addAll(java.util.Collection<? extends T> collection) {
    boolean result = false;
    int position = underlyingList.size();
    if (collection != null) {
        result = underlyingList.addAll(collection);
    }
    if (result) {
        onItemRangeInserted(position, collection.size());
    }
    return result;
}