private void resize(int newSize) {
    Item[] newItems = ((Item[]) (new java.lang.Object[newSize]));
    for (int i = 0; i < (items.length); i++) {
        newItems[i] = items[i];
    }
    items = newItems;
}