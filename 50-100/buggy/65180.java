public static void main(java.lang.String[] args) {
    Deque<java.lang.Integer> deque = new Deque<>();
    deque.addFirst(null);
    deque.removeFirst();
    deque.addLast(2);
    deque.removeLast();
    deque.addFirst(1);
    deque.addLast(2);
    for (java.lang.Integer integer : deque) {
        java.lang.System.out.println((integer + ""));
    }
}