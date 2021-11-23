public static void main(java.lang.String[] args) {
    com.dukeyunz.algs4.Deque<java.lang.String> dq = new com.dukeyunz.algs4.Deque<>();
    dq.addFirst("A");
    dq.addLast("B");
    dq.addLast("C");
    dq.addFirst("begin");
    dq.addLast("D");
    dq.removeFirst();
    dq.removeLast();
    dq.removeLast();
    for (java.lang.String s : dq) {
        edu.princeton.cs.algs4.StdOut.println(s);
    }
}