public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException("Can not enqueue a null item");
    }
    if ((n) == (items.length)) {
        resize(((items.length) * 2));
    }
    items[n] = item;
    (n)++;
}