public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException();
    }
    if ((last) == (items.length)) {
        resize((2 * (items.length)));
    }
    items[((last)++)] = item;
    (n)++;
}