public static void main(java.lang.String[] args) {
    RandomizedQueue<java.lang.String> rq = new RandomizedQueue<java.lang.String>();
    int k = edu.princeton.cs.algs4.StdIn.readInt();
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        java.lang.String a = edu.princeton.cs.algs4.StdIn.readString();
        if (a == null)
            break;
        
        rq.enqueue(a);
    } 
    for (int i = 0; i < k; ++i) {
        edu.princeton.cs.algs4.StdOut.println(rq.dequeue());
    }
}