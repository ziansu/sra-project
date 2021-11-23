public static void main(java.lang.String[] args) {
    Deque<java.lang.Integer> dq = new Deque<java.lang.Integer>();
    dq.addFirst(1);
    dq.addFirst(2);
    edu.princeton.cs.algs4.StdOut.print(dq.removeLast());
    edu.princeton.cs.algs4.StdOut.print(dq.removeLast());
}