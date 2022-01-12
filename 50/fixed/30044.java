public void remove(T item) {
    int index = mItems.indexOf(item);
    if (index >= 0) {
        remove(index);
    }
}