public static void main(java.lang.String[] args) {
    Deque dq = new Deque();
    dq.addFirst(1);
    dq.addFirst(2);
    edu.princeton.cs.algs4.StdOut.print(dq.removeLast());
    edu.princeton.cs.algs4.StdOut.print(dq.removeLast());
}