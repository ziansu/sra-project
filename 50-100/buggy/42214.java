public static void main(java.lang.String[] args) {
    int k = java.lang.Integer.parseInt(args[0]);
    RandomizedQueue<java.lang.String> queue = new RandomizedQueue<java.lang.String>();
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        queue.enqueue(edu.princeton.cs.algs4.StdIn.readString());
    } 
    java.util.Iterator iterator = queue.iterator();
    for (int i = 0; i < k; i++) {
        edu.princeton.cs.algs4.StdOut.println(iterator.next());
    }
}