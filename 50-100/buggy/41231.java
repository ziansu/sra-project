public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if ((n) == (items.length)) {
        resize((2 * (items.length)));
    }
    items[((last)++)] = item;
    (n)++;
}