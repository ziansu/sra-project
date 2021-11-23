public void enqueue(Item item) {
    q[count] = item;
    (count)++;
    if ((count) > (0.75 * (q.length))) {
        edu.princeton.cs.algs4.StdOut.println("enlarge array");
        resize(((q.length) * 2));
    }
}