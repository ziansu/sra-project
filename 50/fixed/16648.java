private boolean addSetItem(NestedSetItem<T> setItem) {
    boolean result = super.add(setItem);
    if (result) {
        setItem.addContainingSet(this);
        addToAllParents(setItem);
    }
    return result;
}