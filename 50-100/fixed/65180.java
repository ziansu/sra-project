public static void main(java.lang.String[] args) {
    Deque<java.lang.Integer> deque = new Deque<>();
    deque.addLast(2);
    deque.removeLast();
    deque.addFirst(1);
    deque.removeLast();
    for (java.lang.Integer integer : deque) {
        java.lang.System.out.println((integer + ""));
    }
}