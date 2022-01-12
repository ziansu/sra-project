public static void main(java.lang.String[] args) {
    final DequeRandomizedQueue.RandomizedQueue<java.lang.String> rq = new DequeRandomizedQueue.RandomizedQueue();
    final int k = java.lang.Integer.parseInt(args[0]);
    while (!(edu.princeton.cs.algs4.StdIn.isEmpty())) {
        java.lang.String s = edu.princeton.cs.algs4.StdIn.readString();
        rq.enqueue(s);
    } 
    int count = 0;
    for (java.lang.String s : rq) {
        java.lang.System.out.println(s);
        if ((++count) == k) {
            break;
        }
    }
}