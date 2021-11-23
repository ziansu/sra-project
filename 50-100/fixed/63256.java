public static void main(java.lang.String[] args) {
    int k = java.lang.Integer.parseInt(args[0]);
    java.lang.String s;
    RandomizedQueue<java.lang.String> r = new RandomizedQueue();
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        s = edu.princeton.cs.algs4.StdIn.readString();
        r.enqueue(s);
    } 
    for (int i = 0; i < k; i++) {
        edu.princeton.cs.algs4.StdOut.println(r.dequeue());
    }
}