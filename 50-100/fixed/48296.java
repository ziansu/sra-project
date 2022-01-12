public void enqueue(Item item) {
    q[count] = item;
    (count)++;
    if ((count) > (0.75 * (q.length))) {
        resize(((q.length) * 2));
    }
}