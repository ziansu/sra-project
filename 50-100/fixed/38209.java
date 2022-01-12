public static void main(java.lang.String[] args) {
    int k = java.lang.Integer.parseInt(args[0]);
    tasks.RandomizedQueue<java.lang.String> q = new tasks.RandomizedQueue();
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        q.enqueue(edu.princeton.cs.algs4.StdIn.readString());
    } 
    for (int i = 0; i < k; i++) {
        edu.princeton.cs.algs4.StdOut.println(q.dequeue());
    }
}