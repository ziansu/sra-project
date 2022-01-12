private void resize(int newSize) {
    Item[] newItems = ((Item[]) (new java.lang.Object[newSize]));
    for (int i = 0; i < (size); i++) {
        newItems[i] = items[i];
    }
    items = newItems;
}