public static void main(java.lang.String[] args) {
    RandomizedQueue rq = new RandomizedQueue();
    for (int i = 1; i < 10; ++i)
        rq.enqueue(i);
    
    for (int i = 1; i < 10; ++i)
        edu.princeton.cs.algs4.StdOut.println(rq.dequeue());
    
}