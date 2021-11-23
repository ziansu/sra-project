public static void main(java.lang.String[] args) {
    Deque<java.lang.Integer> deque = new Deque<java.lang.Integer>();
    for (int i = 0; i < 100; i++) {
        deque.addLast(i);
    }
    for (int i : deque) {
        java.lang.System.out.println(i);
    }
}