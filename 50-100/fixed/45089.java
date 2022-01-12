public static void main(java.lang.String[] args) {
    RandomizedQueue<java.lang.String> rq = new RandomizedQueue<java.lang.String>();
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        java.lang.String a = edu.princeton.cs.algs4.StdIn.readString();
        rq.enqueue(a);
    } 
    int k = java.lang.Integer.parseInt(args[0]);
    for (int i = 0; i < k; ++i) {
        edu.princeton.cs.algs4.StdOut.println(rq.dequeue());
    }
}