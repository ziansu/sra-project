public void enqueue(Item item) {
    if ((tail) == (items.length)) {
        resize((2 * (items.length)));
    }
    if (item == null) {
        throwNullPointerException();
    }
    items[((tail)++)] = item;
    (N)++;
}