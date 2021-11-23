public static void main(java.lang.String[] args) {
    LRUCache l = new LRUCache(2);
    l.set(2, 1);
    java.lang.System.out.println(((((("l: " + l) + ", capacity: ") + (l.capacity)) + ", filled: ") + (l.filled)));
    l.set(2, 2);
    java.lang.System.out.println(((((("l: " + l) + ", capacity: ") + (l.capacity)) + ", filled: ") + (l.filled)));
}