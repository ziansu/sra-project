public static void main(java.lang.String[] args) {
    RandomizedQueue<java.lang.Integer> rq = new RandomizedQueue<java.lang.Integer>();
    for (int i = 1; i < 10; ++i)
        rq.enqueue(i);
    
    for (int i = 1; i < 10; ++i)
        edu.princeton.cs.algs4.StdOut.println(rq.dequeue());
    
}