public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.IllegalArgumentException("Null items are not supported");
    }
    if ((size) == ((items.length) / 2)) {
        items = resize(items, ((items.length) * 2));
    }
    items[size] = item;
    (size)++;
}