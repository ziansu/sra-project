private boolean removeSetItem(NestedSetItem<T> setItem) {
    boolean result = this.remove(setItem);
    if (result) {
        setItem.removeContainingSet(this);
        removeFromChildren(setItem);
    }
    return result;
}