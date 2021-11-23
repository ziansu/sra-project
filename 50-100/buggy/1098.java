public static void main(java.lang.String[] args) {
    LRUCache l = new LRUCache(1);
    l.set(2, 1);
    java.lang.System.out.println(((((("l: " + l) + ", capacity: ") + (l.capacity)) + ", filled: ") + (l.filled)));
    java.lang.System.out.println(("l.get(2): " + (l.get(2))));
}