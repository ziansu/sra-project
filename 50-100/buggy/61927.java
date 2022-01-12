public void enqueue(Item item) {
    if ((N) == (items.length)) {
        resize((2 * (items.length)));
    }else
        if ((tail) == (items.length)) {
            resize(items.length);
        }
    
    if (item == null) {
        throwNullPointerException();
    }
    items[((tail)++)] = item;
    (N)++;
}