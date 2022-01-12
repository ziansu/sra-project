public Item dequeue() {
    validateEmpty();
    int random = edu.princeton.cs.algs4.StdRandom.uniform(counter);
    Item item = q[random];
    q[random] = q[(--(counter))];
    if (((counter) > 0) && ((counter) == ((q.length) / 4))) {
        resize(((q.length) / 2));
    }
    return item;
}