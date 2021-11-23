public void enqueue(Item item) {
    if (item == null) {
        throw new java.lang.NullPointerException("the item to enqueue is null");
    }
    if ((N) == (q.length)) {
        q.resize((2 * (q.length)));
    }
    q[((N)++)] = item;
}