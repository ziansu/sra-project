public static void main(java.lang.String[] args) {
    int n = 10;
    princeton.datastructures.deque.Deque<java.lang.Integer> deq = new princeton.datastructures.deque.Deque<java.lang.Integer>();
    for (int i = 0; i < 2; i++) {
        if ((i % 2) == 0) {
            deq.addFirst(i);
        }else {
            deq.addLast(i);
        }
    }
    for (java.lang.Integer i : deq) {
        java.lang.System.out.println(i);
    }
}