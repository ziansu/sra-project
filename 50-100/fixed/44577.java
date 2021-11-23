public static void main(java.lang.String[] args) {
    Deque<java.lang.Integer> deque = new Deque<java.lang.Integer>();
    for (int i = 0; i < 100; i++) {
        deque.addLast(i);
    }
    int count = 0;
    for (int i : deque) {
        count++;
    }
    java.lang.System.out.println(count);
}