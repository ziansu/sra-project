private void addSetItem(NestedSetItem<T> setItem) {
    if (super.add(setItem)) {
        setItem.addContainingSet(this);
        addToAllParents(setItem);
    }
}