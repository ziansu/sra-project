public Item dequeue() {
    int randomIndex = edu.princeton.cs.algs4.StdRandom.uniform(count);
    Item item = q[randomIndex];
    q[randomIndex] = q[(--(count))];
    q[count] = null;
    if ((count) < (0.25 * (q.length))) {
        resize(((q.length) / 2));
    }
    return item;
}